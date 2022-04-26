//App.java(主方法
public class App{
    public static void main(String[] args)
    {
        Tom p1 = new Tom();
        p1.eat();
    }
}
//------------------------
//Boy.java(父类
//父类中为抽象类
public abstract class Boy {//父类定义为一个抽象类
    public Boy()//这是这个抽象父类的构造方法
    {
        System.out.println("这是父类的构造方法");
    }
    public abstract void eat();//定义一个抽象的方法
}
//补充一点，一个类不一定有一个抽象方法，但是抽象方法所在的类必须是抽象类
//还有就是抽象类的子类要覆盖重写所有的父类抽象方法，除非子类是抽象类
//----------------------
//Boy.java(子类
public class Tom extends Boy{
    public Tom()
    {
        //父类的构造方法的运行实质上是通过子类的这里赠送的super去执行的，当然前提是父类是无参
        System.out.println("子类的构造方法");
    }
    @Override//记得首字母大写，跟之前说的一样，这里就是一个重写的标号
    public void eat()
    {
        System.out.println("吃的方法");
    }
}
//父类有抽象方法，那么子类应该重写所有的抽象方法，否则就会报错
