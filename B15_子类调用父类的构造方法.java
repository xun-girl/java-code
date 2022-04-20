//App.java(主方法
public class App{
    public static void main(String[] args){
        Tom p1 = new Tom();//子类中会默认一个super构造，用来调用父类无参的构造方法，记住是无参的
    }

} 
//------------------------
//Boy.java(父类
public class Boy{
    public String num;
	public Boy()//重载一个无参的构造函数
    {
        System.out.println("执行父类的无参构造");

    }
    public Boy(int num){
        System.out.println("执行父类的有参构造");
    }
    public void methodfu() {
    }
}
//------------------------
//Tom.java(子类
public class Tom extends Boy{
    
    public Tom()
    {
        super();
        //super(10);//加上super之后就会继承有参的那个构造函数，构造方法智能调用其中一个，不能一个子类调用多次super构造
        System.out.println("执行子类构造");
        //子类必须调用父类的构造方法，写了super则用，不写则赠送一个super但是只能调用无参
        //综上所述，super只能有一个，且位置也必须打头

    }

    public void method1() {
    }

    public void methodfu() {
    }

    public void methodzi() {
    }
}