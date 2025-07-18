public class App {
    public static void main(String[] args) throws Exception {
        // Bài tập 1: tổng các phần tử trong mảng
        arrayExample();
        findElement(5);
        binarySearch(10);
    }
    // Array: tập hợp các phần tử cùng kiểu dữ liệu liền kề nhau và có kích thước cố định.
    public static void arrayExample() {
        int[] a = {1, 2, 3, 4, 4};
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
    // Bài 2: tìm kiếm phần tử trong mảng
    //cách 1: tìm kiếm tuần tự
    public static void findElement(int x){
        int[] a = {1, 2, 3, 4, 5};
        boolean found = false;
        int n = a.length;
        for (int i = 0; i <n; i++){
            if(a[i] == x){
                found = true;
                System.out.println("Element " + x + " found at index: " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Element " + x + " not found in the array.");
        }
    }
    //cách 2: tìm kiếm nhị phân
    public static void binarySearch(int x){
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean found = false;
        int left, right, mid;
        left = 0;
        right = a.length - 1;
        while(left <= right){
            mid = (left + right) / 2;
            if(a[mid] == x){
                found = true;
                System.out.println("Element " + x + " found at index: " + mid);
                break;
            }else{
                if(a[mid] < x){
                    left = mid + 1;
                }else{
                    right = mid -1;
                }
            }  
        }
        if (!found) {
            System.out.println("Element " + x + " not found in the array.");
        }
    }
    // viết bằng đệ quy
    public static int BSD(int[] a, int left, int right, int x) {
        if (left > right) {
            return -1; // không tìm thấy
        }
        int mid = (left + right) / 2;
        if (a[mid] == x) {
            return mid; // tìm thấy
        } else if (a[mid] < x) {
            return BSD(a, mid + 1, right, x); // tìm kiếm nửa bên phải
        } else {
            return BSD(a, left, mid - 1, x); // tìm kiếm nửa bên trái
        }
    }
}
