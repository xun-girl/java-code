import java.awt.*;
import java.awt.event.*;
public class App{
  public static void main(String[] args)
  {
    Frame p1 = new Frame("我的第一个java窗口");
    //Panel p2 = new Panel();
    p1.setVisible(true);//设置窗口的可见性
    p1.setSize(500,400);//设置窗口的大小
    p1.setResizable(true);//设置窗口是否可以改变
    p1.setBackground(Color.blue);
    //以下是利用p1中的方法中建立的一个监听事件
    p1.addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) 
    {
       System.exit(0);
    }
    });                         
  }}


          
