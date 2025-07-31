import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throw_Throws {
    public static void main(String[] args) {
        // throws:
        try {
            readFile();
        } catch (Exception e) {
            e.printStackTrace();// in ra thông tin chi tiết về lỗi
        }
        // throw:
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

    }
    public static void readFile() throws FileNotFoundException {
        try{
            FileReader f = new FileReader("test.txt");
        }catch(FileNotFoundException e){
            throw new FileNotFoundException();

        }
    }
    // unchecked exception
    // không cần throws, vì nó là RuntimeException
    public static int divide(int a, int b){
        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0; // Hoặc xử lý khác
        }
    }

    
}