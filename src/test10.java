
public class test10 {
    public static void main(String[] args) {
        int[] s = {2, 8, 6, 2, 7, 3, 9, 2, 8, 6, 7, 9, 1};
        int t;
        int a = s.length;
        //插入排序
        for(int i = 1; i<a; i++){
            for(int j=i;j>0;j--){
                if(s[j] < s[j-1]){
                    t = s[j];
                    s[j] = s[j-1];
                    s[j-1] = t;
                }else
                    break;
            }
        }
        System.out.print("只出现一次的数字为：");
        if(s[0] != s[1])
            System.out.print(s[0]+" ");
        for(int i = 1; i<a-1; i++ ){
            if((s[i]!=s[i-1])&&(s[i]!=s[i+1]))
                System.out.print(s[i]+" ");
        }
        if(s[a-1]!=s[a-2])
            System.out.print(s[a-1]);
    }
}
