## Exception throwable: error/ exception
# Exception: built-in exception và user-defined exception
# Built-in Exception: được định nghĩa sẵn do java cung cấp để xử lý lỗi thường gặp trong quá trình thực thi chương trình
- Checked exception:được gọi là ngoại lệ thời gian biên dịch vì những ngoại lệ này được trình biên dịch kiểm tra tại thời điểm biên dịch
Ví dụ: lỗi connection database, I/O, mở file không tồn tại,...

- Uncheckep exception: Trình biên dịch sẽ không kiểm tra tại thời điểm biên dịch và NÉM ra ngoại lệ mà không được kiểm tra. (Do lỗi lập trình)
Ví dụ: phép toán bất hợp pháp, truy cập index mảng mà không hợp lệ,...

# User-defined exception: try-catch Block, finally Block
- Java Virtural Machine thực hiện khối try, có exception thì bỏ qua các câu lệnh bên dưới trong try block
- Nếu có exception thì thực hiện khối catch
- Nếu không tìm thấy khối catch nào khớp thì JVM thực hiện exception mặc định
- Cuối cùng thực hiện khối finally nếu có dù khối catch có thực hiện thành công hay không

# final, finally, finalize
- final: biến, method, class sử dụng thì không thể thay đổi, kế thừa
- finally: Finally Block luôn được thực hiện cho dù exception handling như thế nào
- finalize: method được trình thu gom rác gọi ra trước khi removed đối tượng khỏi bộ nhớ 

# Xử lý trường hợp NullPointer
- equals()
- dùng toán tử 3 ngôi
- kiểm tra đối số phương thức

# Throw/Throws
- Throws: nằm sau phương thức, dùng cho checked Exception, có thể có throw, la lên có exception, buộc phải xử lý 
- Throw: nằm bên trong hàm, phương thức, bắt buộc có throws khi checked exception, chủ động ném

# User-defined Customer Exception
- extends Exception
- extends RuntimeException