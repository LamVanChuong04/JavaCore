public abstract class AbstractExample implements InterfaceExample {
    private String phone;
    final int age = 21;

    

    public AbstractExample(String phone) {
        this.phone = phone;
        System.out.println("SĐT:"+ phone);

    }
    public static void print(){
        System.out.println("This is a static method in AbstractExample");
    }
    public final void finalMethod(){
        System.out.println("This is a final method in AbstractExample");
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }
    public abstract void listen();

}
