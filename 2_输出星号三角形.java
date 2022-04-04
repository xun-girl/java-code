public class helloworld {
    public static void main(String[] arcoac) {

        /*
        找到输出空格和*与行数的对应关系，空格输出到line-1，*号输出到11-2*line
         */
        for (int line = 5; line >=1; line--)//循环一行一行执行
        {
            for (int i = 1; i <= (line - 1); i++)
            {
                System.out.print(" ");
            }
            //首先这两个循环体必须是先后执行，先输出空格 后输出星号，且以行为单位，输出一行 两个作为一个整体循环一次，则必须嵌套再一个循环中，而循环变量取决于行数
            for (int i = 1; i <= (11 - 2 * line); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
/*输出结果
     *
    ***
   *****
  *******
 *********
 */
