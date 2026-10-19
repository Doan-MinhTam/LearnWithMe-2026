package com.sortedlist;

public class MySortedArrayIntList extends MyAbstractSortedIntList {
    private static final int DEFAULT_CAPACITY = 4;
    private int[] data;
    private int size;

    public MySortedArrayIntList() {
        data = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    private void extend() { /* TODO — cấp phát mảng mới lớn hơn (gấp đôi), copy dữ liệu cũ sang */
        int[] newArray = new int[data.length*2];
        System.arraycopy(data, 0, newArray, 0, size);
        data = newArray;
    }

    @Override public void add(int value) { /* TODO */
        if (size == data.length) {
            extend();
        }
        int i = size - 1;
        while (i >= 0 && data[i] > value) {
            data[i + 1] = data[i];
            i--;
        }
        data[i + 1] = value;
        size++;
    }
    @Override public int binarySearch(int value) { /* TODO */
        //Tôi không nhớ, đây là đáp án AI tạo
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (data[mid] == value) {
                return mid;
            } else if (data[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -(left)-1; //Yeu cau de tra ve vi tri value can chen vao
    }
    @Override public boolean contains(int value) { /* TODO */
        return binarySearch(value) >= 0;
    }
    @Override public void remove(int value) { /* TODO */
        int index = binarySearch(value);
        if (index >= 0) {
            // Dịch chuyển các phần tử phía sau sang trái để đè lên vị trí xóa
            for (int i = index; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            size--;
        }
    }
    @Override public void clear() { /* TODO */
        size = 0;
        data = new int[DEFAULT_CAPACITY];
    }
    @Override public int get(int index) { /* TODO */
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }
    @Override public int size() { return size; }
    @Override public int[] toArray() { /* TODO */
        int[] result = new int[size];
        System.arraycopy(data, 0, result, 0, size);
        return result;
    }
}