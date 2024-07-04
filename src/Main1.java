import java.io.File;

public class Main1 {
    public static void main(String[] args) {
        File dir = new File("C:\\Program Files\\Test");
        if(dir.isDirectory()){

            for(File item : dir.listFiles()){
                if(item.isDirectory()){
                    System.out.println(item.getName() + " \t folder");
                } else {
                    System.out.println(item.getName() + " \t file");
                }
            }

        }
    }

}
