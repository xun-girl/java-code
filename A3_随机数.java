import java.util.*;//星号可以一次导入改包中的所有类
//写一则程序目的是输出n个随机数，并且每次输出一个都要有回车
    public class App {
        public static void main(String[] args){
          System.out.print("请输入n的值，来确定最终生成随机数的个数:");
          Scanner in = new Scanner(System.in);
          Random r= new Random(); //声明类的对象(找一条具体的狗）,
          int number = in.nextInt();//这里是输入语句,对象in使用其方法nextInt
          in.close();//Scanner中的对象在调用完成之后记得要进行关闭
          //这里提醒一下，每次使用都要进行关闭，如果下一次还要使用那么在新建一个对象
          //Scanner好用的地方就在于可以直接输入特定数据类型 然后再进行转换
          int i=1,a;
          while(i<=number)//很简单的while循环
          {
            a = r.nextInt(100)+1;//这里是输入1到100之间的随机数,即0+1~max+1
            i++;
            System.out.println(a);
        }
      }
    }