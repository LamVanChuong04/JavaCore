public interface InterfaceExample {
    final int x = 10;
    public static int y = 12;

    public void eat();
    public void move();

    public static void methodStatic(){
        System.out.println("Static method in InterfaceExample");
    }
    public default void methodDefault(){
        System.out.println("Default method in InterfaceExample");
    }
    
    private void methodPrivate(){
        System.out.println("Private method in InterfaceExample");
    }
    
}
