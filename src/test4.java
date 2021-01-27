public class test4 {
    public static void main(String[] args) {
        int a = 361;
        System.out.println("您的高考总分:"+a);
        int b = 451;
        System.out.println("第一批本科录取分数线:"+b);
        System.out.print("高考结果:");
        System.out.println((a>=b)?"通过一本录取分数线":"未通过一本录取分数线");
    }
}
