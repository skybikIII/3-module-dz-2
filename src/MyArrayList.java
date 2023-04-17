import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList<E> extends AbstractList<E> {

    private int size = 0;
    private Object[] elements;
    private static final int DEFAULT_CAPACITY = 10;

    MyArrayList() {

        elements = new Object[DEFAULT_CAPACITY];
    }

    MyArrayList(int size) {
        this.size = size;
        elements = new Object[size];
    }

    public void add(int index, E value) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = value;
        size++;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }

    public E remove(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object item = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (E) item;
    }
}
