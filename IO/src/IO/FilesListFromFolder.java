package IO;


import java.io.File;
 
public class FilesListFromFolder {
     
    public static void main(String a[]){
        File file = new File("E:/");
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }
        System.out.println("***********************************"); 
        File file1 = new File("E:/");
            File[] files1 = file1.listFiles();
            for(File f1: files1){
                System.out.println(f1.getName());
        }
    }
}
