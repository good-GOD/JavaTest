public class test3 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0;i<=1000;i++){
            if((i%2 == 0)&&(i!=40)&&(i!=48)){
                sum = sum+i;
                if(sum>+25000)
                    break;
            }
        }
        System.out.println("0到1000之间(40,48跳过，大于等于25000跳出)偶数的和为："+sum);
    }
}
