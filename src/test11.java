import java.util.Random;
import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("命令行输入:");
        String str = sc.next();
        Random rand = new Random();
        if(str.equals("GET")){
            int randNum = rand.nextInt(1000000);  //固定生成的随机数范围
            System.out.print("命令行输出:");
            if(randNum<10)
                System.out.print("00000"+randNum);
            else if(randNum<100)
                System.out.print("0000"+randNum);
            else if(randNum<1000)
                System.out.print("000"+randNum);
            else if(randNum<10000)
                System.out.print("00"+randNum);
            else if(randNum<100000)
                System.out.print("0"+randNum);
            else
                System.out.print(randNum);
        }
    }
}
