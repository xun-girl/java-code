import java.io.*;

public class App {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(reader.readLine());// 加上这个转换就可以实现通过Buffered输入一个整形
            System.out.print(a);
        } catch (IOException e) {
            System.out.println(e.getMessage()); // getMessage用来返回Throwable 的详细消息
            System.out.println(e.toString());//返回此 Throwable 的简短描述。打印异常名称
            System.out.println(e);//将此 throwable 及其追踪输出至标准错误流。
            e.printStackTrace();//打印出错的位置
           //以上写的例外处理，在程序正常运行的时候均不会对程序产生较大的影响，只是为了方便在程序出错的时候方便查错

        } // 实践证明在这样使用的时候需要加上一个例外处理，不然程序会报错

    }

}
