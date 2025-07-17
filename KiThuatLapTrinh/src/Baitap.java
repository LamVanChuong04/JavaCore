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
    }
}
