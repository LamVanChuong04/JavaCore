import java.io.File;
import java.io.IOException;

public class CreateFile {
    
    public static void main(String[] args) {
        try{
            File f = new File("text.txt");
            // tạo file mới
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }
            // xóa file
            f.delete();
            System.out.println("File deleted: " + f.getName());
        }catch(IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
