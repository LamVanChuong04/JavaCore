public class ExtendsException extends Exception {
    
    public ExtendsException(String message) {
        super(message);
    }

    public static void validateAge(int age) throws ExtendsException  {
        if (age < 18) {
            throw new ExtendsException("Age must be at least 18");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(20);
        } catch (ExtendsException ex) {
            System.out.println("Caught user-defined exception: " + ex.getMessage());
        }
    }
}
