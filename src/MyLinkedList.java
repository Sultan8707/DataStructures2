public class MyLinkedList<T> implements MyList<T> {
    private class MyNode {
        T data;
        MyNode next, prev;

        MyNode(T data) {
            this.data = data;
        }
    }

    private MyNode head, tail;
    private int length;

    public MyLinkedList() {
        head = tail = null;
        length = 0;
    }

    public void add(T item) {
        MyNode newNode = new MyNode(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public int size() {
        return length;
    }

    public void remove(int index) {
        checkIndex(index);
        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current.prev != null) current.prev.next = current.next;
        else head = current.next;
        if (current.next != null) current.next.prev = current.prev;
        else tail = current.prev;
        length--;
    }

    public void clear() {
        head = tail = null;
        length = 0;
    }

    public T get(int index) {
        checkIndex(index);
        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + length);
        }
    }
}

