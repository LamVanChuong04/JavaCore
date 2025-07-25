import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        // ArrayList
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println("ArrayList: " + a);
        // duyệt mảng: for-each
        // chuyển ArrayList sang mảng
        Integer array[] = a.toArray(new Integer[0]);
        // chuyển mảng sang ArrayList
        List<Integer> b = new ArrayList<>(List.of(array));
        // LinkedList
        a = new LinkedList<>();
        a.add(null);
        a.add(10);
        a.add(10);
        a.add(20);
        System.out.println("LinkedList: " + a);
        // Vector
        a = new Vector<>();
        a.add(100);
        a.add(200);
        a.add(null);
        System.out.println("Vector: " + a);
        a.remove(null);
        System.out.println("Vector: " + a);
        System.out.println(a.size());
        a.get(10);
        
    }
}
