public class Animal {
    private String name;
    private int leg;
    private String color;

    public Animal(String name, int leg, String color) {
        this.name = name;
        this.leg = leg;
        this.color = color;
    }
    public Animal(){}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLeg() {
        return leg;
    }
    public void setLeg(int leg) {
        this.leg = leg;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void makeSound() {
        System.out.println("Animal sound");
    }
    @Override
    public String toString() {
        return "Animal [name=" + name + ", leg=" + leg + ", color=" + color + "]";
    }

    
}
