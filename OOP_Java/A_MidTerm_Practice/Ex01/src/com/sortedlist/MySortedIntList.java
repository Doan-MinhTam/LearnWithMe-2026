package com.sortedlist;

public interface MySortedIntList {
    void add(int value);          // thêm value, giữ danh sách luôn tăng dần; bỏ qua nếu value đã tồn tại
    int binarySearch(int value);  // tìm thấy -> trả về index; không thấy -> trả về -(vị trí nên chèn) - 1
    boolean contains(int value);
    void remove(int value);       // không làm gì nếu value không tồn tại
    void clear();
    int get(int index);
    int size();
    int[] toArray();
}