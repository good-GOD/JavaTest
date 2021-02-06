import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一串字符：");
        String str = sc.next();
        int a = str.length();
        int t = 0;
        for(int i=0; i<0.5*a; i++){
            if(str.charAt(i) != str.charAt(a-i-1)){
                t=1;
                break;
            }
        }
        if(t == 0)
            System.out.println("该字符串是一个回文数");
        else
            System.out.println("该字符串不是一个回文数");
    }
}
