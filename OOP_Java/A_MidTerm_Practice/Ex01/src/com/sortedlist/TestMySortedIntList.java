package com.sortedlist;

public class TestMySortedIntList {
    public static void main(String[] args) {
        int[] values = {5, 2, 8, 2, 1, 9, 3};
        testImpl(new MySortedArrayIntList(), values, "ArrayIntList");
        testImpl(new MySortedLinkedIntList(), values, "LinkedIntList");
    }

    private static void testImpl(MySortedIntList list, int[] values, String label) {
        System.out.println("=== " + label + " ===");
        for (int v : values) {
            list.add(v);
            System.out.println("add(" + v + ") -> " + list);
        }
        System.out.println("contains(8) = " + list.contains(8));
        System.out.println("contains(100) = " + list.contains(100));
        System.out.println("indexOf-qua-binarySearch(9) = " + list.binarySearch(9));
        list.remove(2);
        System.out.println("remove(2) -> " + list);
        System.out.println("size() = " + list.size());
    }
}