public class App {
    public static void main(String[] args) throws Exception {
        Brother br1 = new Brother();
        Brother br2 = new Brother();
        Brother br3 = new Brother();
        
        
        br3.addr = "HÀ NỘI";
        System.out.println(br3.addr);
        br1.finalMethod();
        AbstractExample child = new Childrent("0987654321");
        
        child.listen();
        
    
    }
}
