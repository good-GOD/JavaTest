public class test17 {
    //例题有误，最小元素为0，实际结果为 9,1,3,8,7,4,6,0
    public static void main(String[] args) {
        int[] a = {3,1,9,8,0,4,6,7};
        swap(a);
    }
    public static void swap(int[] a){
        int max = 0,j = 0,min = 100,k = 0;
        for(int i =0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
                j=i;
            }
            if(a[i]<min){
                min = a[i];
                k=i;
            }
        }
        a[j] = a[0];
        a[0] = max;
        a[k] = a[a.length-1];
        a[a.length-1] = min;
        for (int c = 0; c < a.length; c++) {
            System.out.print(a[c]);
            if (c < a.length - 1)
                System.out.print(",");
        }
    }
}
