package com.sortedlist;

public abstract class MyAbstractSortedIntList implements MySortedIntList {
    protected boolean checkBoundaries(int index) {
        /* TODO — true nếu 0 <= index < size() */
        return index >= 0 && index < size();
    }

    @Override
    public String toString() {
        /* TODO — định dạng "[v0, v1, v2]" */
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size(); i++) {
            sb.append(get(i));
            if (i < size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}