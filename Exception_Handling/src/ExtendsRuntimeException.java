public class ExtendsRuntimeException extends RuntimeException {
    
    public ExtendsRuntimeException(String message) {
        super(message);
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new ExtendsRuntimeException("Age must be at least 18");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(10);
        } catch (ExtendsRuntimeException ex) {
            System.out.println("Caught user-defined runtime exception: " + ex.getMessage());
        }
    }
}
