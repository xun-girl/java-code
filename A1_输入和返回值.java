    import java.util.*;//输出需要调用java.util包

    public class App {
        public static void main(String[] args){
    
           Scanner s = new Scanner(System.in);
           int a,b ;
           a = s.nextInt();//输入一个整形变量,nextLine 适合字符串
           b = sum(a);  //实参
           s.close(); //若没有关闭Scanner对象将会出现警告
           
           System.out.print("最后的结果是："+b);
        }
           public static int sum(int a)//形参
           {
               return a+3;//该函数返回a+3，使得sum() = a+3
        
            }
                
}