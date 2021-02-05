import java.io.File;
import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入路径：");
        File file= new File(sc.next());
        if(file.isDirectory()) {
            System.out.println("目录【" + file + "】中有以下文件：");
            String[] fs = file.list();  //list()方法是返回某个目录下的所有文件和目录的文件名，返回的是String数组
            for (String f : fs) {
                System.out.println(f);
            }
            //        File[] fs = file.listFiles(); //listFiles()方法是返回某个目录下所有文件和目录的绝对路径，返回的是File数组
            //        for(File f:fs){
            //            System.out.println(f.getName());  //getname() 返回文件名
        }
        else
            System.out.println("此路径不存在");
    }
}
