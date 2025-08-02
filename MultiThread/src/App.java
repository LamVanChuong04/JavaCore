public class App {
    public static void main(String[] args) throws Exception {
        ExtendsThread thread1 = new ExtendsThread();
        ImpleRunable impl = new ImpleRunable();
        Thread thread3 = new Thread(impl);
        thread1.start();
        thread3.start();
        
        // Wait for the thread to finish
        
    }
}
