import java.util.*;

//写一则程序 要求定义一个数组 并且确保程序1灵活性 要求输入一个数字 查找处数组中有的多少哥值为target的元素
        public class App {
        public static void main(String[] args) 
        {
          int [] arr = {1 ,2,3,4,5,4,4,6,6,6,7,7,73,3,35,5,5,2};//定义一个数组并且将其初始化赋值
          Scanner in = new Scanner(System.in);//这里不用多说顶一个输入的对象（实例）
          System.out.print("请输入你想要查询的值:");//
          int target = in.nextInt();//声明target并且输入
          in.close();//用完记得关闭
          int a =count(target,arr);
          System.out.print(target+"出现的次数为"+a+"次");

        }
        //为了保证程序的之间的低耦合性 这里选用自定一个函数进行
        public static int count(int target,int[] arry)//形参里面有该数组和target
        {//这里多说一句形参其实就相当于在自定义函数程序中的变量了，在自定函数中使用形参中变量的名字
          int count = 0;
          for(int i:arry)//遍历数组中的各个元素
          {
            if(i == target)

            {
              count++;
            }
        }
          return count;//上传到main
    }
  }