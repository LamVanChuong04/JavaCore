public class App {
    public static void main(String[] args) throws Exception {
        // Bài tập 1: tổng các phần tử trong mảng
        arrayExample();
    }
    // Array: tập hợp các phần tử cùng kiểu dữ liệu liền kề nhau và có kích thước cố định.
    public static void arrayExample() {
        int[] a = {1, 2, 3, 4, 4};
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
