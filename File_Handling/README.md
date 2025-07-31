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
- Read from a File
- Write to a File
- Delete a File