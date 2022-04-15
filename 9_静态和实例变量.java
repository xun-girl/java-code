//定义一个简单的类
public class App {
  public static void main(String[] args) 
  {
    
    Person.age = 18;
    Person.age = 1;
    System.out.println(Person.age);
    System.out.println(Person.age);//最终两者打印的结果都是1
    //static--Variables belong to the entire class rather than to a single instance
    //----------------------Below are the instance variables
    Person boy = new Person();//实例变量
    boy.height = 185;
    System.out.println(boy.height);
    //静态变量的一个特点就是 在 整个类中可以无视对象 虽然这两个age属于两个对象 但是由于static的作用 所以最终的输出结果都是最后一次赋值时候的值
    //因此以上的写法是不准确的 static 的域是在类中 因此要把对象换成类名
  }//形式上 static是class.name ; instance 是object.name
}
  class Person
  {
    static int age;//this is a static variable
    int height;//this is a instance variable
  } 

