package com.company.java;//idea的包
import java.util.*;//输出需要调用java.util包

public class helloworld {//文件名为helloworld
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("输入你的姓名：");
        String name = s.nextLine();//name 变量声明
        System.out.print("输入你的年龄：");
        int age = s.nextInt();//age变量 声明
        System.out.println("姓名：" + name + "  年龄：" + age );

        s.close();         //若没有关闭Scanner对象将会出现警告

    }

}
