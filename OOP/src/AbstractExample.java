public abstract class AbstractExample implements InterfaceExample {
   private String name;

   public static int count = 0;

   final int c = 47;

   public AbstractExample(String name) {
        this.name = name;
        System.out.println("name: "+ name);
    //    count++;
    //    System.out.println("Count: " + count);

   }

    public String getName() {
         return name;
    }
    public void setName(String name) {
         this.name = name;
    }
    public abstract void display();

    public void makeSound() {
        System.out.println("Animal makes sound hẹ hẹ hẹ hẹ");
    }

}
