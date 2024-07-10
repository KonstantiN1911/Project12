import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        File myFile = new File("C:\\Program Files\\Test\\document.txt");
        System.out.println("File name: " + myFile.getName());
        System.out.println("Parent folder: " + myFile.getParent());
        if(myFile.exists()){
            System.out.println("File exists");
        } else{
            System.out.println("File not found");
        }

        System.out.println("File size: " + myFile.length());
        if(myFile.canRead()){
            System.out.println("File can be read");
        } else {
            System.out.println("File can not be read");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время записи " + (endTime - startTime));

        DataOutputStream streamWriter = new DataOutputStream(new FileOutputStream("C:\\Program Files\\Test\\document.txt"));
        streamWriter.write(12312);
        streamWriter.close();
    }
}
