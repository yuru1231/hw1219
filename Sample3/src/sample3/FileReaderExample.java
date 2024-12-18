package sample3;
import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        File file = new File("example.txt"); // 指定檔案路徑
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("檔案內容：");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("檔案未找到：" + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤：" + e.getMessage());
        }
    }
}
