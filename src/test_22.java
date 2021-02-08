import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一串字符：");
        String a = sc.next();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int len = a.length();
        //将a拆分为单个字符存储在map集合
        for(int j1 = 0; j1<len; j1++)
            if(map.containsKey(a.charAt(j1)))
                map.put(a.charAt(j1), map.get(a.charAt(j1)) + 1);
            else
                map.put(a.charAt(j1), 1);
        //找出出现频率最大的字符出现的次数
        Object[] b = map.values().toArray();
        int max = 0;
        for (Object o : b)
            if (max < (int)o)
                max = (int)o;
        //从字符串中删除出现频率最大的字符
        for(int j2 = len-1; j2 >=0; j2--)
            if(map.get(a.charAt(j2)) == max)
                a = a.substring(0,j2)+a.substring(j2+1);
        System.out.print(a);
    }
}
