public class UnCheckedException {
    public static void main(String[] args) {
        try {
            
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Không thể thực hiện phép toán" );
        }
        
        System.out.println("Tiếp tục chương trình");
    }
}
