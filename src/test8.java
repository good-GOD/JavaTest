import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入两个数并以逗号隔开(除数在前)：");
        String str = in.next();
        String[] arr = str.split(",");
        int[] b = new int[2];
        b[0] = Integer.parseInt(arr[0]);
        b[1] = Integer.parseInt(arr[1]);
        try {
            int a=b[0]/b[1];
            System.out.println("计算结果为："+a);
        }
        catch (Exception e)
        {
            StringWriter result = new StringWriter();   // StringWriter将包含堆栈信息
            PrintWriter printWriter = new PrintWriter(result);  //必须将StringWriter封装成PrintWriter对象，以满足printStackTrace的要求
            e.fillInStackTrace().printStackTrace(printWriter);  //获取堆栈信息
            System.out.println("出现异常 "+result.toString());  //输出异常信息
        }
    }
}
