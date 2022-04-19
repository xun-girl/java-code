//写一个重写覆盖的例子
/*
提纲Boy所具有的特点
唱歌，跳舞，学习
而Tom除此之外，在学习上又有了数学和编程
*/
//App.java(主方法
public class App{
    public static void main(String[] args)
    {
    Boy p1 = new Boy();//创建父类的对象，并且调用相关的方法
    p1.sing();
    p1.dance();
    p1.study();
    System.out.println("分割线---------------");
    Tom p2 = new Tom();//同理创建子类对象
    p2.sing();
    p2.dance();
    p2.study();
}
}
//------------------------
//Boy.java(父类
public class Boy{
    public void sing()
    {
        System.out.println("我会唱歌");
    }
    public void dance()
    {
        System.out.println("我会跳街舞");
    }
    public void study()
    {
        System.out.println("我爱学习");
    }
}
//----------------------------
//Tom.java(子类
public class Tom extends Boy{
    @Override  //加上一个重写标识符，仅仅作为提醒作用
    public void study(){
        super.study();//借助关键字super可以调用父类中的方法
        System.out.println("我爱数学");
        System.out.println("我爱编程");//这两项是对父类方法study()的补充
    }
}