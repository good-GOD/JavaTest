import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class test7 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();  //获取当前日期
        String date = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));  //LocalDate转为String类

        LocalTime localTime = LocalTime.now();  //获取当前时间
        String time = localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));  //LocalTime转为String类

        LocalDateTime localDateTime = LocalDateTime.now(); //获取当前日期和时间
        String datetime = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")); //LocalDateTime转为String类

        System.out.println("当前日期为："+date);
        System.out.println("当前时间为："+time);
        System.out.println("当前日期和时间为："+datetime);
    }
}
