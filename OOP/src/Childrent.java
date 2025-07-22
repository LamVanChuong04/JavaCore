public class Childrent extends Brother{
    private String school;

    public Childrent(String school) {
        this.school = school;
    }
    public Childrent(){}
    @Override
    public void print(){
        System.out.println("Hello from Childrent class!");
    }
    public static void foo(){
        t = 500;
        System.out.println("Static method in Childrent class: " + t);

    }
}
