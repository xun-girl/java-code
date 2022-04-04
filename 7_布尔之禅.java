import java.util.*;//导入对应的包

//布尔之禅
//以下程序的作用是 输入一个数字判断是不是位于50-100区间，来个简单的一行代码吧
        public class App {
        public static void main(String[] args){
          System.out.print("请输入一个数字让我们来判断它是否满足条件:");
          Scanner in  = new Scanner(System.in);//和之前的一样，创建一个输入的对象(类的实例）
          int number = in.nextInt();//对象调用其具有的方法nextInt()
          in.close();//记得关闭该对象
          boolean result = panduan(number);//声明result为布尔型，由于return的作用，方法(函数)=return的值
          System.out.print("判断的结果"+result);
        }
        public static boolean panduan(int number)//该函数的返回值是boolean,所以声明的时候记得带上
        {
          return(number>=50&&number<=100);//这里巧妙运用了布尔和逻辑运算的关系
        }
      }