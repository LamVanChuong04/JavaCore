public class NullPointer {
    
    public static void main(String[] agrs){
        String t = null, c = "hello";

        // cách 1: dùng equals để so sánh với null
        System.out.println("CÁCH 1");
        try{
            if(c.equals(t)){
                System.out.println("Same");
            }else{
                System.out.println("Not same");
            }
        }
        catch(NullPointerException e){
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }

        // cách 2: check đối số của phương thức
        String ex = "xin chào";
        System.out.println("CÁCH 2");
        try{
            System.out.println("Do dai cua chuoi la: " + getLength(t));

        }catch(NullPointerException e){
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
        // cách 3: dùng toán tử ba ngôi
        System.out.println("CÁCH 3");
        String result = (t != null) ? t : "String is null";
        System.out.println("Result: " + result);

    }
    public static int getLength(String st){
        if(st == null){
            throw new NullPointerException("String is null");
        }
        return st.length();
    }
}
