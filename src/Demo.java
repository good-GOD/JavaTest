public class Demo {
    public static int maxdate(int a,int b){
//        if(a<b)
//            return b;
//        else
//            return a;
        return Math.max(a,b);
    }
    public static int maxdate(int a,int b,int c){
        int max1 = Math.max(a,b);
        return Math.max(max1,c);
    }
    public static double maxdate(double a,double b){
       return Math.max(a,b);
    }
    public static double maxdate(double a,double b,double c){
        double max1 = Math.max(a,b);
        return Math.max(max1,c);
    }

}
