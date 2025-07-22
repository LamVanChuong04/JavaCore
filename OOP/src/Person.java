public interface Person extends Person2 {
    public final String name = "lâm văn chương";
    
    public void eat();
    public void sleep();

    default void run() {
        System.out.println("Person is running");
    }
    public static void print() {
        System.out.println("Person is printing");
    }
    public int add(int a, int b);

    public float add(float a, float b);
}
