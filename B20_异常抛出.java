//java中的buffered的用法
import java.io.* ;
public class App{
	public static void main(String args[]){
		BufferedReader buf = null ;		//声明对象的结构其实类似于声明一个变量，类型 名字 = new ......
		buf = new BufferedReader(new InputStreamReader(System.in)) ;	// 将字节流变为字符流
		String str = null ;	// 接收输入内容接受真正的值之前，现将str赋给一个空值
        String str2 = null;
		System.out.print("请输入内容：") ;
		try{
			str = buf.readLine() ;	// 读取一行数据，如果这个语句异常，那么就执行下面的catch
            str2 = buf.readLine() ;//这里一次性输入两个变量
            //readLine就是面向行的读取，可以输入一个字符串
		}catch(IOException e){
			e.printStackTrace() ;	// 输出信息
		}//这里其实就是我们常说的例外处理 
		System.out.println("输入的内容为：" + str+str2) ;//以这种方式输入最终str和str2都是字符串
	}
};

