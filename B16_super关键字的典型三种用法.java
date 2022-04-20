//App.java(主方法
//总结一下super关键字的典型三种案例
//1.在子类的成员方法中访问父类的成员变量
//2.在子类的成员方法中访问父类的成员方法
//3.在子类的构造方法中访问父类的构造方法
public class App{
    public static void main(String[] args){
        Tom p1 = new Tom();
        System.out.println("-----------------分割线");
        p1.method1();
        System.out.println("-----------------分割线");
        p1.methodzi();//子类对象p1调用子类的方法
    }
} 
//------------------------
//Boy.java(父类
public class Boy{
    //1.定义一个父类的成员变量
    int num = 100;

    //2.定义一个父类中的成员方法
    public void methodfu(){
        System.out.println("创建一个父类中的实例方法");

    }

    //3.创建父类的构造函数
    public Boy(){
        System.out.println("这是父类无参的构造函数");
    }
    public Boy(int num){
        System.out.println("这是父类有参的构造函数");
    }
}
//------------------------
//Tom.java(子类
public class Tom extends Boy{
    //1.创建一个子类中的同名成员变量num
    int num =50;
    
    public void method1()
    {
        System.out.println("父类的成员变量是"+super.num);
        System.out.println("让我们看看这个num是谁的值呢"+num);

    }
    //2.创建一个新的子类的实例方法
    public void methodzi()
    {
        super.methodfu();//利用super引用父类的方法，当然，如果子类该方法和父类相同，这里就相当于重写了
        System.out.println("创建一个子类中实例方法");
    }
    //3.创建子类的构造函数
    public Tom(){
        super();//这里可以直接调用父类中的无参构造函数，当然也可以不写会赠送
        //super(10);//这里可以直接调用父类中的有参函数，当然这个不会赠送。最后记得super只可以有一个且必须打头
        System.out.println("这是子类的构造函数");
    }
}