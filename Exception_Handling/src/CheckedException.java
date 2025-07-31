public class CheckedException {
    
    public static void main(String[] agrs){
        
        try {
            // Simulating a checked exception
            throw new Exception("This is a checked exception");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        
        System.out.println("Program continues after handling the exception.");
    }
}
