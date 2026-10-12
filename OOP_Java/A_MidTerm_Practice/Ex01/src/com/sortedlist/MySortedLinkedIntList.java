package com.sortedlist;

public class MySortedLinkedIntList extends MyAbstractSortedIntList {

    private static class Node {
        int value;
        Node next;
        Node(int value) { this.value = value; }
    }

    private Node head;
    private int size;

    public MySortedLinkedIntList() {
        head = null;
        size = 0;
    }

    @Override public void add(int value) { /* TODO — chú ý ca chèn ở đầu */ }
    @Override public int binarySearch(int value) { /* TODO — Node không truy cập ngẫu nhiên được; vẫn phải giữ đúng ngữ nghĩa trả về như interface mô tả */ }
    @Override public boolean contains(int value) { /* TODO */ }
    @Override public void remove(int value) { /* TODO — chú ý ca xoá ở đầu (đổi head) */ }
    @Override public void clear() { /* TODO */ }
    @Override public int get(int index) { /* TODO */ }
    @Override public int size() { return size; }
    @Override public int[] toArray() { /* TODO */ }
}