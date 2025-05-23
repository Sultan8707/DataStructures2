public class MyQueue<T> {
    private MyLinkedList<T> data = new MyLinkedList<>();

    public void enqueue(T item) {
        data.add(item);
    }

    public T dequeue() {
        T item = data.get(0);
        data.remove(0);
        return item;
    }

    public T peek() {
        return data.get(0);
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.size() == 0;
    }
}
