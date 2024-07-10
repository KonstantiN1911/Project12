import java.io.File;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) {
        String directoryPath = "C:\\Program Files\\Test\\";
        String filePath = directoryPath + "document.txt";

        File directory = new File(directoryPath);
        File file = new File(filePath);

        // Проверяем существование каталога
        if (!directory.exists()) {
            System.out.println("Каталог не существует, создаем...");
            if (directory.mkdirs()) {
                System.out.println("Каталог успешно создан.");
            } else {
                System.out.println("Ошибка при создании каталога.");
                return;
            }
        }

        try {
            if (file.createNewFile()) {
                System.out.println("Файл успешно создан.");
                System.out.println("Полный путь к файлу: " + file.getAbsolutePath());
                System.out.println("Размер файла: " + file.length() + " байт");
                System.out.println("Путь к каталогу: " + file.getParent());
            } else {
                System.out.println("Файл уже существует.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }

    }

}
