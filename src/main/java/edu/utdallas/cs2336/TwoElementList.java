

package edu.utdallas.cs2336;


public class TwoElementList<T> implements SimpleList<T> {
    private T[] elements = (T[]) new Object[2];

    @Override
    public void set(int index, T value) {
        if (index < 0 || index >= 2) {
            throw new IndexOutOfBoundsException("Index must be 0 or 1");
        }
        elements[index] = value;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= 2) {
            throw new IndexOutOfBoundsException("Index must be 0 or 1");
        }
        return elements[index];
    }
}
