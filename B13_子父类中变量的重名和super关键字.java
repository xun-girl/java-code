//模拟一下子类和父类
//App.java(主方法
public class App{
    public static void main(String[] args){
            Tom a = new Tom();
            a.way();

    }
}
//-----------------------
//Boy.java(父类文件
public class Boy{

    //在父类中定义一个成员变量
    int num =30;
}
//-------------------------
//Tom,java(子类文件
public class Tom extends Boy{
    //同样的我们在子类中也定义一个成员变量
    int num =20;
    public void way(){
        int num= 10;
        System.out.println(num);//10局部变量，直接访问就可以，优先级最高
        System.out.println(this.num);//20这里就是成员变量和局部变量重名的时候，需要借助关键字this
        System.out.println(super.num);//用super关键字去访问

    }
}
/**输出结果
 * 10
 *20
 *30
 **/
