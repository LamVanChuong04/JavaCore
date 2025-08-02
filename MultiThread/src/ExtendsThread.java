public class ExtendsThread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 5; i++) {
            System.out.println("Extends Thread is running " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    
}
