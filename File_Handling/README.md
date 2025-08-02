# Các luồng(Stream) trong java
- Luồng character: Hỗ trợ nhập xuất dữ liệu kiểu kí tự (Unicode)
+ Dùng 2 abstract class: reader, writer
- Luồng byte: Hỗ trợ nhập xuất dữ liệu trên byte, thường đọc ghi dữ liệu dạng nhị phân.
+ Dùng 2 abstract class: inputstream, outputstream

Quy trình cơ bản sẽ gồm 4 bước chính:
Bước 1: Tạo đối tượng luồng
Bước 2: Tiến hành liên kết với nguồn dữ liệu.
Bước 3: Thao tác dữ liệu (đọc hoặc ghi hoặc cả hai).
Bước 4: Đóng luồng.

# Các thao tác với file:
- Create a File

### Read from a File:
+ BufferedReader + FileReader: tốt nhất cho đọc text theo từng dòng
Đọc một lượng lớn ký tự vào bộ đệm cùng lúc từ file.
Sau đó trả dần dần từng dòng (readLine()) hoặc từng ký tự (read()).
→ Giảm số lần truy xuất file, đọc nhanh hơn, ít tốn tài nguyên hơn FileReader.

+ FileInputStream: tốt nhất cho đọc file nhị phân
+ RandomAccessFile: 

### Write to a File:
+ FileWriter: ghi file với size nhỏ/vừa 
+ BufferedWriter: tốt về hiệu năng khi xử lý lượng văn bản lớn nhìu dòng
Thay vì ghi từng ký tự vào file ngay lập tức, BufferedWriter lưu tạm vào bộ đệm (RAM).
Khi bộ đệm đầy hoặc bạn gọi flush() / close(), dữ liệu mới thực sự được ghi ra đĩa.
→ Giảm số lần ghi đĩa, tăng hiệu năng, đặc biệt khi ghi nhiều dòng.

+ FileOutputStream: tốt nhất cho các file nhị phân
+ PrintWriter: tốt nhất cho dữ liệu có cấu trúc như báo cáo, nhật ký

- Delete a File



