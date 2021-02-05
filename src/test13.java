import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入账号：");
        String acc = sc.next();
        System.out.print("请输入密码：");
        String pass = sc.next();
        Map<String,String> map = new HashMap<>();
        map.put("admin","admin@123");
        map.put("guess","123456");
        map.put("my","my_666");
        if(map.containsKey(acc)){
            if(map.get(acc).equals(pass))
                System.out.println("登录成功");
            else
                System.out.println("您输入的账号或密码不正确");
        }
        else
            System.out.println("您输入的账号或密码不正确");

    }
}
