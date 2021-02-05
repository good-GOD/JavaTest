import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class test12 {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        // cal.set(year, month-1, date, hourOfDay, minute, second);
        cal.set(2020, 11, 10, 10, 30, 0);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(cal.getTime()));   //SimpleDateFormat类格式化日期
    }
}
