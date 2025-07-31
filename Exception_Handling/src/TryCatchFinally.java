public class TryCatchFinally {
    
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0; 
            
            }catch (ArithmeticException e) {
                System.out.println("Caught an exception: " + e.getMessage());
            }
            try {
                String str = null;
                System.out.println(str.length()); 
            } catch (NullPointerException e) {
                System.out.println("Caught a NullPointerException: " + e.getMessage());
            }
            
        }
        catch (Exception e) {
            System.out.println("Caught a Exception: " + e.getMessage());
        } finally {
            System.out.println("Luôn thực hiện khối finally");
        }
        
        
    }
}
