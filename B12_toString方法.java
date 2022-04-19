//由一则程序演示一下toString()的作用
//App.java
//toSting的方法就是可以通过该方法的设定，直接打印对象就可以得到相关的值
public class App
{
public static void main(String[] args)
{
      Boy person = new Boy("john",19);//利用构造函数
      System.out.println(person.toString());
      //上下两个语句的最终结果是相同的
      //上面是常规的相当于调用方法，下面的是利用toString()方法的特点——直接打印对象名会得到其返回值
      System.out.println(person);
}
}
//Boy.java
//这里首先声明一个类
public class Boy {
    String name;
    int age;
    public Boy(String name,int age)//这里定义一个构造函数确保程序的便利性
    {//注意此时成员变量和局部变量（形参）的名字相同，因此要在成员变量面前加上this,没有return
       this.name = name;
       this.age = age;
    }
    public String toString()//在类中定义toString方法，注意该方法是具有返回值的
    {
       return ("I'm "+name+"and I'm "+age+"years old");
    }
 }
/**输出结果
 * I'm johnand I'm 19years old
 * I'm johnand I'm 19years old
 * */