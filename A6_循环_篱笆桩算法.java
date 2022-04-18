    //篱笆桩算法
    //如果你要做一段100英尺长的篱笆,其中每隔10英尺放置一个木桩，那么你最终需要多少个木桩
    //下面程序我们用','作为绳子，数字代替木桩
    public class App {
        public static void main(String[] args){
          System.out.print("1");
          for(int i = 2;10*(i-1)<=100;i++)//第一个木桩在0m处，第二个在10m处，以此推出木桩和位置的关系
          {
            System.out.print(",");
            System.out.print(i);
          }
      }
    }