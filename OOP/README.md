# day 1: học về kế thừa và đa hình
# static: variable, method, class
- Biến: cấp phát bộ nhớ 1 lần, các lớp con sử dụng, có thể thay đổi
- Method static: không thể override, sử dụng variable non-static, thuộc class không thuộc đối tượng
# final: variable, method, class
- Biến: không thể thay đổi giá trị
- Method final: không thể override, không kế thừa
- Class final: không thể kế thừa
# Tính đa hình: một đối tượng hay 1 phương thức có các hình thái, hình thức khác nhau
- Override (ghi đè): Lớp con có thể ghi đè/ chỉnh sửa phương thức của lớp cha
- Overloading (nạp chồng): method cùng tên, khác nhau về số lượng tham số, kiểu dữ liệu, thứ tự các tham số
- Upcasting: Đối tượng của lớp con có thể chuyển đổi thành kiểu của lớp cha
# Tính đóng gói: ẩn đi các dữ liệu cụ thể của đối tượng và cho phép truy cập thông qua các phương thức công khai => lấy giá trị thông qua getter và thay đổi giá trị thông qua setter
- Access Modifier: 
+ public: truy cập mọi nơi trong ứng dụng
+ private: truy cập trong phạm vi của class
+ protected: truy cập trong 1 package hoặc lớp con kế thừa

# Tính kế thừa: đơn kế thừa
# Interface: là một giao diện chứa các phương thức trừu tượng chỉ có định nghĩa, biến constant(final, static), method static/default
- Khi lớp con extends từ interface thì phải override lại các method abstract đó.
- Không có contructor
- Hỗ trợ đa kế thừa
