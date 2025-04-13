public class MyArrayList<T> implements MyList<T> {
    private Object[] elements;
    private int length;

    public MyArrayList() {
        elements = new Object[5];
        length = 0;
    }

    public void add(T item) {
        if (length == elements.length) {
            increaseBuffer();
        }
        elements[length++] = item;
    }

    public void add(int index, T item) {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + length);
        }
        if (length == elements.length) {
            increaseBuffer();
        }
        for (int i = length; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = item;
        length++;
    }

    private void increaseBuffer() {
        Object[] newElements = new Object[length * 2];
        for (int i = 0; i < length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public int size() {
        return length;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + length);
        }
    }

    public void clear() {
        elements = new Object[5];
        length = 0;
    }

    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        length--;
    }
}

