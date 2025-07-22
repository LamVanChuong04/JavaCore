public class Childrent extends Brother implements Person{
    @Override
    public void eat() {
        System.out.println("Childrent is eating");
    }
    @Override
    public void sleep() {
        System.out.println("Childrent is sleeping");
    }
    public Childrent(){

    }
    @Override
    public int add(int a, int b) {
        return a + b;
    }
    @Override
    public float add(float a, float b) {
        return a + b;
    }
}
