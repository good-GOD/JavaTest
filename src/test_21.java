import java.io.IOException;
import java.util.Scanner;

public class test_21 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入日期：");
        String dateString = sc.next();
        if(validate(dateString) == 0){
            System.out.println("您输入的内容不是一个日期!!!");
        }
        else
            System.out.println(dateString+"是"+dateString.substring(0, 4)+"年第"+validate(dateString)+"天");
    }

    //判断日期函数，日期格式错误返回0，正确返回天数
    public static int validate(String dateString){
        if(dateString.length()<10 || dateString.length()>11)
            return 0;
        //得到年，月，日，取得非数字时返回0
        int year,month,day;
        try {
            year = Integer.parseInt(dateString.substring(0, 4));
            month = Integer.parseInt(dateString.substring(5, 7));
            day = Integer.parseInt(dateString.substring(8, 10));
        }catch (NumberFormatException e){
            return 0;
        }

        //判断分隔符是否正确
        String year_sep = dateString.substring(4,5);
        String month_sep = dateString.substring(7,8);
        if(dateString.length() == 10)
            if( (!year_sep.equals("/") || !month_sep.equals("/")) && (!year_sep.equals("-") || !month_sep.equals("-")))
                return 0;
        String day_sep;
        if(dateString.length() == 11) {
            day_sep = dateString.substring(10,11);
            if( !year_sep.equals("年") || !month_sep.equals("月") || !day_sep.equals("日"))
                return 0;
        }

        //判断月份及对应日期是否合法
        if(month<1 || month>12)
            return 0;
        int[] monthLengths = new int[]{0, 31, -1, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(isLeapYear(year)){
            monthLengths[2] = 29;
        }else{
            monthLengths[2] = 28;
        }
        int monthLength = monthLengths[month];
        if(day<1 || day>monthLength){
            return 0;
        }
        //计算天数
        int sumday = day;
        for(int i = 1; i<month; i++){
            sumday = sumday + monthLengths[i];
        }
        return sumday;
    }

    //是否是闰年
    private static boolean isLeapYear(int year){
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ;
    }
}

