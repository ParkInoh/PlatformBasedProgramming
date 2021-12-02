package edu.pnu.collection;

public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size;

    public GenericList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public Object[] getData() {
        return data;
    }
}
