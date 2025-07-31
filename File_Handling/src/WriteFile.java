import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] agrs){
        try{
            FileWriter w = new FileWriter("text.txt");
            w.write("Xin chào, Dòng này tôi mới ghi vào file lần 2.");
            w.close();
            System.out.println("Đã ghi vào file thành công.");

        }catch (IOException e){
            System.out.println("Có lỗi xảy ra.");
            e.printStackTrace();
        }
    }
}
