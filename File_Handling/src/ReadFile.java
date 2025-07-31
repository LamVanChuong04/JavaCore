import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("text.txt");
            Scanner r = new Scanner(fr);
            while (r.hasNextLine()) {
                String data = r.nextLine();
                System.out.println(data);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra khi đọc file.");
            e.printStackTrace();
        }
        System.out.println("\nĐã đọc file thành công.");
    }
}
