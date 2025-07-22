public class Brother {
    private String name;
    private int age;
    // biến static chỉ cấp phát bộ nhớ 1 lần, các lớp con có thể sử dụng
    // method static không override, chỉ có thể gọi đến biến static

    static int t= 100;
    static int count = 0;
    // Constructor
    public Brother(){
        count++;
        System.out.println(count);
    }
    public Brother(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void print(){
        System.out.println("Hello Brother class!");
    }
    
    public int add(int a, int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }
    // không thể ghi đè
    public static void foo(){
        
        System.out.println("Static method in Brother class"+ t);
    }
    
    
}
