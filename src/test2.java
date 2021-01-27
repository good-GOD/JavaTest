public class test2 {
    public static void main(String[] args) {
        int [] odd1 = new int[15];
        int j=0;
        for(int i=30;i>=0;i--){
            if(i%2 == 1){
                odd1[j]=i;
                j++;
            }
        }
        int [] odd2 = new int[12];
        System.out.println("30以内从大到小的前12个奇数为：");
        for(int i=0;i<=11;i++){
            odd2[i]=odd1[i];
            System.out.println(odd2[i]);
        }


    }
}
