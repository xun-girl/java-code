//这里封装了一个类，并且运用函数的方法去访问这个类
//对比 Python 来看，java 使用同目录下的不同文件的类时，不需要 import 那个文件的名字，直接使用即可,前提是放在同一个项目文件夹内。
//App.java
public class App
{
        public static void main(String args[]){
        Boy encap = new Boy();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");//set函数的作用是赋值给字段
        System.out.print("Name : " + encap.getName()+ 
                " Age : "+ encap.getAge());//get函数的作用是访问私有字段
        }
}
//-----------------------------------分界线
//Boy.java
//将该类封装
public class Boy {
  
    private String name;
    private String idNum;
    private int age;
    //字段都是private即只有在类的内部可以被访问和调用
    public int getAge(){
       return age;
    }
  
    public String getName(){
       return name;
    }
  
    public String getIdNum(){//IdNum的可读属性
       return idNum;
    }
  
    public void setAge(int newAge){
       age = newAge;
    }
  
    public void setName(String newName){
       name = newName;
    }

    public void setIdNum( String newId){//IdNum的可写属性
       idNum = newId;//这里提示一个小细节 就是this.idNum = idNum,形参设定为idNum
    }
}//创建一对赋取值方法，即set和get，即三个私有字段的可读(get)和可写(set)属性
/**输出结果：
 * Name : James Age : 20
 * 
 * */