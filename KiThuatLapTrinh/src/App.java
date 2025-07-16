public class App {

    public static void main(String[] args) throws Exception {
        // có 2 kiểu dữ liệu: nguyên thủy và tham chiếu
        // nguyên thủy: int, float, double, boolean, char, byte, short
        // tham chiếu: String, Array, Class, Object
        // nguyên thủy được lưu trữ trực tiếp trong bộ nhớ stack
        // tham chiếu được lưu trữ trong bộ nhớ heap và stack chỉ lưu trữ địa chỉ ô nhớ đó
        // String là bất biến, mỗi lần thay đổi sẽ tạo ra một đối tượng mới trong bộ nhớ heap
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");
        System.out.println(a == b); // true, vì a và b đều trỏ đến cùng một ô nhớ trong heap
        System.out.println(a == c); // false, vì a và c trỏ đến hai ô nhớ khác nhau trong heap
        System.out.println(a.equals(c)); // true, vì nội dung của a và c là giống nhau
        //  StringBuffer: khả biến, thay đổi nội dung mà không tạo ra đối tượng mới
        // StringBuffer: không ghi đè equals và toString, nên so sánh bằng ==
        // StringBuffer so sánh địa chỉ ô nhớ, không so sánh nội dung
        // StringBuffer.toString() sẽ trả về một chuỗi mới, nên so sánh bằng equals sẽ so sánh nội dung
        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println(sb == sb2); // false, vì sb và sb2 là hai đối tượng khác nhau trong heap
        System.out.println(sb.toString().equals(sb2.toString())); // true,

        // tìm số chẵn lẻ mà ko dùng toán tử %
        int x = 10; // 1010 & 0001
        if ((x & 1) == 0) {
            System.out.println("x là số chẵn");
        } else {
            System.out.println("x là số lẻ");

        }
        // chuyển đổi số nguyên sang nhị phân
        String t = "";
        while(x>0){
            t = x % 2 + t;
            x = x / 2;
        }
        System.out.println("Số nhị phân của x là: " + t);

        // chuyển đổi số nhị phân sang số nguyên
        String binary = "1101";
        int d = 0;
        int n = binary.length();
        for(int i = 0; i<n; i++){
            char bit = binary.charAt(n - 1 - i);
            if(bit == '1'){
                d += Math.pow(2, i);
            }
        }
        System.out.println("Số nguyên của chuỗi nhị phân " + binary + " là: " + d);
    }
}
