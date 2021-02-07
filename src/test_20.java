import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test_20 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File("E:\\white_list.txt");
        List white_list = new ArrayList();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        //按行读取文件存入列表
        while ((line = br.readLine()) != null)
            white_list.add(line);
        br.close();
        System.out.print("请输入IP：");
        String ip = sc.next();
        int t = 0;
        if (test_20.isIP(ip)) {
            for (int i = 0; i < white_list.size(); i++) {
                if(ip.equals(white_list.get(i))) {
                    System.out.println("该IP地址可以访问网络^v^");
                    t = 1;
                }
            }
            if(t == 0)
                System.out.println("该IP地址不可以访问网络!!!");
        }
        else
            System.out.println("该IP格式有误!!!");
    }
    //用正则表达式进行判断是否为IP地址
    private static boolean isIP(String ip) {
        String regex = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
        // 判断ip地址是否与正则表达式匹配
        if (ip.matches(regex)) {
            String[] arr = ip.split("\\.");
            for (int i = 0; i < 4; i++) {
                int temp = Integer.parseInt(arr[i]);
                //如果某个数字不是0到255之间的数 就返回false
                if (temp < 0 || temp > 255)
                    return false;
            }
            return true;
        } else
            return false;
    }
}

