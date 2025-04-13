public class MyStack<T> {
    private MyArrayList<T> data = new MyArrayList<>();

    public void push(T item) {
        data.add(item);
    }

    public T pop() {
        T item = data.get(data.size() - 1);
        data.remove(data.size() - 1);
        return item;
    }

    public T peek() {
        return data.get(data.size() - 1);
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.size() == 0;
    }
}

