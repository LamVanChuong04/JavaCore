import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // ArrayList
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println("ArrayList: " + a);
        // LinkedList
        a = new LinkedList<>();
        a.add(null);
        a.add(10);
        a.add(10);
        a.add(20);
        System.out.println("LinkedList: " + a);
    }
}
