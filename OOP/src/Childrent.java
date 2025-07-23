public class Childrent extends AbstractExample {

    public Childrent(String phone) {
        super(phone);
    }
    @Override
    public void listen() {
        System.out.println("Listening in Childrent");
    }
    @Override
    public void eat() {
        System.out.println("Eating in Childrent");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping in Childrent");
    }
   
}
