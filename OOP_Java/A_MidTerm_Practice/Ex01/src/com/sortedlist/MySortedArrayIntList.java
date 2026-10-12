package com.sortedlist;

public class MySortedArrayIntList extends MyAbstractSortedIntList {
    private static final int DEFAULT_CAPACITY = 4;
    private int[] data;
    private int size;

    public MySortedArrayIntList() {
        data = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    private void extend() { /* TODO — cấp phát mảng mới lớn hơn (gấp đôi), copy dữ liệu cũ sang */ }

    @Override public void add(int value) { /* TODO */ }
    @Override public int binarySearch(int value) { /* TODO */ }
    @Override public boolean contains(int value) { /* TODO */ }
    @Override public void remove(int value) { /* TODO */ }
    @Override public void clear() { /* TODO */ }
    @Override public int get(int index) { /* TODO */ }
    @Override public int size() { return size; }
    @Override public int[] toArray() { /* TODO */ }
}