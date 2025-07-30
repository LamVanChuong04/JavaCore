## Có 2 loại java colletions:
# 1. Interface Collection
1. Interface List: ArrayList, LinkedList, Vector
ArrayList: mảng động, cho phép các giá trị trùng lặp và null
LinkedList: tương tự như arraylist, các phần tử liên kết với nhau thông qua địa chỉ ô nhớ
- Truy cập ngẫu nhiên phần tử chậm hơn ArrayList
- Lãng phí bộ nhớ, khó quản lý nếu dùng không đúng cách
Vector: tương tự như ArrayList nhưng đồng bộ, 1 thời điểm chỉ chạy 1 thread
Một số phương thức: add(), remove(), clear(), isEmpty(), size(),...
2. Interface Set: HashSet, LinkedHashSet, TreeSet

3. Interface Queue: ArrayDeque, ProrityQueue
# 2. Map Collection
HashMap, LinkedHashMap, TreeMap
- 