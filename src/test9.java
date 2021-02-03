import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {

        //只能算1000以内，请问大于1000后该怎么做？

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个小于1000的整数：");
        int s = sc.nextInt();   //键入数据
        int a=s,b=1;    //a用来检测输入数据的位数，b记录位数
        long s1 = 0,sum=0;
        //while循环检测位数
        while(a >= 10){
            a = a/10;
            b++;
        }
        //for循环实现 x+xx+xxx+xxxx+xxxx+xxx+xx+x
        for(int i=0; i<4; i++){
            s1=s1*((int)Math.pow(10,b))+s;
            sum=sum+2*s1;
        }
        //加上xxxxx
        sum = sum+s1*((int)Math.pow(10,b))+s;
        System.out.println(sum);
    }
}
