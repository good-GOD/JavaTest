import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入两个数，数之间以逗号隔开，除数在前：");
        String str = sc.next();
        String[] arr = str.split(",");
        int[] b = new int[2];
        b[0] = Integer.parseInt(arr[0]);
        b[1] = Integer.parseInt(arr[1]);
        try
        {
            int a = b[0]/b[1];
            System.out.println("计算结果为："+a);//输出结果
        }
        catch (Exception e)
        {
            // StringWriter将包含堆栈信息
            StringWriter stringWriter = new StringWriter();
            //必须将StringWriter封装成PrintWriter对象，以满足printStackTrace的要求
            PrintWriter printWriter = new PrintWriter(stringWriter);
            //获取堆栈信息
            e.printStackTrace(printWriter);
            System.out.print("出现异常 "+stringWriter);
        }
    }
}
