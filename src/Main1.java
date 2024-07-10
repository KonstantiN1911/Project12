import java.io.File;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) {
        String directoryPath = "C:\\Program Files\\Test\\";
        String filePath = directoryPath + "document.txt";

        File directory = new File(directoryPath);
        File file = new File(filePath);

        // ��������� ������������� ��������
        if (!directory.exists()) {
            System.out.println("������� �� ����������, �������...");
            if (directory.mkdirs()) {
                System.out.println("������� ������� ������.");
            } else {
                System.out.println("������ ��� �������� ��������.");
                return;
            }
        }

        try {
            if (file.createNewFile()) {
                System.out.println("���� ������� ������.");
                System.out.println("������ ���� � �����: " + file.getAbsolutePath());
                System.out.println("������ �����: " + file.length() + " ����");
                System.out.println("���� � ��������: " + file.getParent());
            } else {
                System.out.println("���� ��� ����������.");
            }
        } catch (IOException e) {
            System.out.println("������ ��� �������� �����: " + e.getMessage());
        }

    }

}
