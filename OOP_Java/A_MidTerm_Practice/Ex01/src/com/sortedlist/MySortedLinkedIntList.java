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

    @Override public void add(int value) { /* TODO — chú ý ca chèn ở đầu */
        Node newNode = new Node(value);
        // Trường hợp 1: Danh sách rỗng hoặc chèn vào trước phần tử đầu tiên (head)
        if (head == null || head.value >= value) {
            newNode.next = head;
            head = newNode;
        } else {
            // Trường hợp 2: Chèn vào giữa hoặc cuối danh sách
            Node current = head;
            while (current.next != null && current.next.value < value) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }
    @Override public int binarySearch(int value) { /* TODO — Node không truy cập ngẫu nhiên được; vẫn phải giữ đúng ngữ nghĩa trả về như interface mô tả */
        // Vì Linked List không hỗ trợ truy cập ngẫu nhiên như mảng, ta duyệt tuần tự
        // kết hợp đặc điểm đã sắp xếp để dừng sớm khi giá trị vượt quá giá trị cần tìm.
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == value) {
                return index;
            } else if (current.value > value) {
                break; // Vượt qua giá trị cần tìm vì danh sách tăng dần -> dừng luôn
            }
            current = current.next;
            index++;
        }
        return -1; // Không tìm thấy
    }
    @Override public boolean contains(int value) { /* TODO */
        return binarySearch(value) >= 0;
    }
    @Override public void remove(int value) { /* TODO — chú ý ca xoá ở đầu (đổi head) */
        if (head == null) {
            return;
        }

        // Trường hợp 1: Xóa ngay phần tử đầu tiên (head)
        if (head.value == value) {
            head = head.next;
            size--;
            return;
        }

        // Trường hợp 2: Xóa phần tử ở giữa hoặc cuối
        Node current = head;
        while (current.next != null && current.next.value < value) {
            current = current.next;
        }

        if (current.next != null && current.next.value == value) {
            current.next = current.next.next;
            size--;
        }
    }
    @Override public void clear() { /* TODO */
        head = null;
        size = 0;
    }
    @Override public int get(int index) { /* TODO */
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }
    @Override public int size() { return size; }
    @Override public int[] toArray() { /* TODO */
        int[] result = new int[size];
        Node current = head;
        int i = 0;
        while (current != null) {
            result[i++] = current.value;
            current = current.next;
        }
        return result;
    }
}