import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入10个整数，以“,”隔开:");
        String str = sc.next();
        //字符串分割
        String[] arr = str.split(",");
        //当数据含有非整数时捕获异常
        try {
            //检测数组元素个数
            if (arr.length == 10) {
                //以下转换适用于大小的数组
                //将String数组转换为int数组
                int[] b = new int[arr.length];
                for (int i = 0; i < b.length; i++) {
                    b[i] = Integer.parseInt(arr[i]);
                }
                //数组对换
                for (int j = 0; j < 0.5 * b.length; j++) {
                    t = b[j];
                    b[j] = b[b.length - j - 1];
                    b[b.length - j - 1] = t;
                }
                //输出数组
                for (int k = 0; k < b.length; k++) {
                    System.out.print(b[k]);
                    if (k < b.length - 1)
                        System.out.print(",");
                }
            } else
                System.out.println("输入数组元素个数有误！！");
        }catch (NumberFormatException e){
            System.out.println("输入数组元素含有非整数！！");
        }
    }
}
