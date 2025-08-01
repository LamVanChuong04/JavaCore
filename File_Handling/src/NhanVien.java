import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public class NhanVien {
    private String ID;
    private String hoTen;
    private int tuoi;
    private int luong;

    public NhanVien(String ID, String hoTen, int tuoi, int luong) {
        this.ID = ID;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.luong = luong;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public int getLuong() {
        return luong;
    }
    public void setLuong(int luong) {
        this.luong = luong;
    }
    @Override
    public String toString() {
        return "[ID=" + ID + ", hoTen=" + hoTen + ", tuoi=" + tuoi + ", luong=" + luong + "]";
    }
    // nhập thông tin nhân viên
    public static NhanVien NhapThongTin(Scanner sc) {
        System.out.print("Nhap ID: ");
        String id = sc.nextLine();
        System.out.print("Nhap Ho Ten: ");
        String name = sc.nextLine();
        System.out.print("Nhap Tuoi: ");
        int tuoi = sc.nextInt();
        System.out.print("Nhap Luong: ");
        int luong = sc.nextInt();
        sc.nextLine(); // xóa buffer sau khi đọc số nguyên
        return  new NhanVien(id, name, tuoi, luong);
    }
    // Đọc file
    public static void readFile(String fileName){
        try {
            // tạo đối tượng luồng và liên kết với nguồn dữ liệu
            File file = new File(fileName);
            FileReader fr = new FileReader(file);

            // đọc dữ liệu từ file
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            // đóng luồng
            fr.close();
            br.close();

        } catch (Exception e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
    
    public static void main(String[] args)  {
        String fileName = "Test.txt";
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        int n = sc.nextInt();
        sc.nextLine(); // xóa buffer sau khi đọc số nguyên
        List<NhanVien> dsNhanVien = new java.util.ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + i  + ":");
            dsNhanVien.add(NhapThongTin(sc));
        }
        sc.close();
        
        try{
            // tạo luồng dữ liệu và liên kết với nguồn dữ liệu
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file); // true để ghi nối tiếp

            // ghi dữ liệu vào file
            for (NhanVien nv : dsNhanVien) {
            // ghi từng nhân viên vào file
                fw.write(nv.toString() + "\n");
        }
            // đóng luồng
            fw.close();
        }catch (Exception e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
        // đọc file sau khi ghi 
        System.out.println("Nội dung file Test.txt:");
        readFile(fileName);
        
    }
}
