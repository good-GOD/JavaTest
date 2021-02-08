import java.io.File;
import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入路径：");
        File file= new File(sc.next());
        System.out.println("目录【" + file + "】中有以下文件：");
        if(file.isDirectory())
            method(file);
        else
            System.out.println("此路径下无文件");
    }

    public static void method(File file){
        if(file.isDirectory()) {
            File[] fl = file.listFiles();   //获取file目录下所有文件、目录
            for(File f : fl){
                if(f.isDirectory())
                    method(f);
                else{
                    String fs = f.getName();  //list()方法是返回某个目录下的所有文件和目录的文件名，返回的是String数组
                    System.out.println(fs);
                    }
                }
            }
        }
    }

