import java.util.Scanner;
import java.util.Stack;

public class test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String str = sc.next();
        int t = 0;
        Stack<Character> sk = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                sk.push(str.charAt(i));
                t++;
            } else if (str.charAt(i) == ')') {
                t++;
                if ((!sk.empty()) && (sk.peek() == '(') && (t != 1))    //t=1时说明第一个括号为“）”
                    sk.pop();
                else
                    break;
            }
        }
        if (t != 0) {
            if (sk.empty() && t!=1)
                System.out.println("您输入的内容，括号完全配对");
            else
                System.out.println("您输入的内容，括号不配对");
        } else
            System.out.println("您输入的内容没有括号");
    }
}
