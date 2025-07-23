public class Fish extends AbstractExample {
    
    public Fish(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }
    @Override
    public void move() {    
        System.out.println("Fish is swimming");
    }
    @Override
    public void display() {
        System.out.println("Fish display method");
    }
    public void testSuper(){
        super.makeSound();
        System.out.println("Fish testSuper method");
    }
    
}
