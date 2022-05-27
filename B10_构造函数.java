//写一个java中的构造函数的范例
public class App {
        public static void main(String[] args) {
                Boy tom = new Boy(4, 6);// 这里类似于自定函数中的实参
                System.out.println(tom.x);
                System.out.println(tom.y);
        }
}

class Boy// 声明一个类
{
        int x;
        int y;// 这是类的实例变量，属于成员变量的一种

        public Boy(int x, int y)// 这里类似于自定以函数中的形参
        {
                this.x = x + 5;
                this.y = y + 5;// 这里可以直接对类调用的变量值每一个都加五
                // 由于此时成员变量和局部变量（形参）重名，若不加this使用的是x、y是局部变量,对成员变量没有任何影响，造成这种现象的原因是，该方法没有return
                // 如果不加this最终的输出结果将是0
                // 如果右边也加this，最终的输出结果将都是5，原因是没有用到实参传过来的4和6，而this.x/y默认是0，0+5 = 5
        }
}
/**
 * 最终的输出结果
 * 9
 * 11
 **/