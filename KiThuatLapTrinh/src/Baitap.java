import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
        // Bài tập 1: Kiểm tra số chẵn lẽ, nhập từ bàn phím
        // c1: dùng %
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println("So chan");
        }else{
            System.out.println("So le");
        }
        // c2: dùng & (bitwise AND)
        if ((number & 1) == 0){
            System.out.println("Số chẵn");
        } else {
            System.out.println("Số lẻ");
        }
        // Bài tập 2: Tổng các số từ 1 đến n, nhập n từ bàn phím
        // c1: dùng vòng lặp for
        int sum = 0;
        for(int i = 1; i<= number; i++){
            sum += i;
        }
        System.out.println(sum);
        // c2: dùng công thức n(n+1)/2
        int total = number * (number + 1) / 2;
        System.out.println(total);
        // Bài tập 3: In bảng cửu chương, nhập n từ bàn phím
        for(int i = 0; i<= 10; i++){
            System.out.printf("%d * %d = %d%n", number, i, number * i);
        }
        
     
        System.out.println(factorial(number));
    }
    // Bài tập 4: Tính giai thừa của n, nhập n từ bàn phím
    // c1: O(n) về thời gian, O(n) về bộ nhớ
    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    // c2: dùng vòng lặp for => O(n) hiệu suất tốt hơn về bộ nhớ O(1)
    public static int factorialIterative(int n){
        int result = 1;
        for(int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
