//App.java(主方法
//定义一个接口的格式
public class App{
    public static void main(String[] args)
    {
        System.out.println("hello 主函数");
        Tom impl = new Tom();//创建类的对象
        impl.metho1();//调用成员方法
        impl.metho2();
    }
}
//Boy.java(接口
public interface Boy{
    public abstract void metho1();

    public default void metho2() {
        System.out.println("这是一个默认方法");//默认方法会被继承
    }
}
//接口中的抽象方法 修饰符必须是固定的两个字——public abstract可以省略默认
//Tom.java(接口的子类
public class Tom implements Boy{
    public  void metho1()
    {
        System.out.println("hello 接口");
    }
    public void metho2()
    {
        System.out.println("重写了这个默认方法");
    }//默认方法的作用就是相当于再重写之前提供一个缺省值  
}
