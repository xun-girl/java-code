
//java中的传统输入
import java.io.*;

//这里主要借助java中的scanner类
public class App {
        public static void main(String[] args) {
                File p1 = new File("e:\\zhangxun.txt");
                // 判断一个文件是否存在 如果存在就删除 如果不存在就创建
                if (p1.exists()) {
                        p1.delete();
                        System.out.println("文件已经销毁");

                } else// 如果不存在这个文件创建
                {
                        System.out.println("文件已经被创建");
                        try {
                                p1.createNewFile();// 如果不存在 创建一个新的文件
                        } catch (IOException e) {//如果代码区出错就会返回异常处理

                                e.printStackTrace();//处理代码块
                        }

                }
                // 如何输出一个文件列表

        }
}