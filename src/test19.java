import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test19 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File("E:\\demo.txt");
        FileInputStream in = new FileInputStream(file); //把信息放在流中
        byte[] bs = new byte[in.available()];   //available():信息总共的字节大小
        in.read(bs);    //读取整个文件
        String text = new String(bs);
        String[] textArray = text.split("\\W+");    //用非单词符来做分割，分割出来的就是一个个单词
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < textArray.length; i++) {
            String key = textArray[i];
            String key_l = key.toLowerCase();   //转为小写
            if(!"".equals(key_l)){  // 判断key_l非空
                Integer num = map.get(key_l);
                if(num == null || num == 0){
                    map.put(key_l, 1);
                }else if(num > 0){
                    map.put(key_l, num+1);
                }
            }
        }
        System.out.print("请输入要查询的单词：");
        String str = sc.next();
        String[] strArray = str.split("\\w+");
        if(strArray.length > 1)
            System.out.println("只允许输入一个单词查询！！！");
        else
            System.out.println(str+"在文件中出现了"+map.get(str.toLowerCase())+"次");
        in.close(); //关闭流
    }
}
