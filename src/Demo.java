public class Demo {
    public static int maxdata(int a,int b){
//        if(a<b)
//            return b;
//        else
//            return a;
        return Math.max(a,b);
    }
    public static int maxdata(int a,int b,int c){
        int max1 = Math.max(a,b);
        return Math.max(max1,c);
    }
    public static double maxdata(double a,double b){
       return Math.max(a,b);
    }
    public static double maxdata(double a,double b,double c){
        double max1 = Math.max(a,b);
        return Math.max(max1,c);
    }

}
