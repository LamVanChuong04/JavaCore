public interface InterfaceExample {
    final String addr = "HÀ NỘI";
    public static int number = 10;

    public void eat();
    public void sleep();

    public static void print() {
        System.out.println("This is a static method in InterfaceExample");
    }
    public default void walk() {
        System.out.println("Walking in InterfaceExample");
    }
    
}
