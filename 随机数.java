package com.company.java;
import java.util.Random;//导入包
public class helloworld{
    public static void main(String[] args){
        //创建对象
        Random r =new Random();
        int number =r.nextInt(10);//这里数据的范围是0到9，不包括10
        //int number =r.nextInt(10)+1;//这样写可以确保数据范围是1到10，其他类似
        System.out.println("number ="+number);


    }

}
