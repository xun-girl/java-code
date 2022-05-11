//java中的传统输入
import java.io.*;

//这里主要借助java中的scanner类
public class App {
        public static void main(String[] args) {
                File p1 = new File("e:\\zhangxun.txt");
                System.out.println(p1.getName());// 文件的名字
                System.out.println(p1.exists());// 文件是否存在返回一个布尔类型
                System.out.println(p1.length());// 文件的长度
                System.out.println(p1.getAbsolutePath());//输出文件所在绝对路径
                System.out.println(p1.isDirectory());//判断是否是文件夹
                System.out.println(p1.isFile());//判断是不是文件
                //如何输出一个文件列表

        }
}       