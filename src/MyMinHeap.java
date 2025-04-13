public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap = new MyArrayList<>();

    public void insert(T item) {
        heap.add(item);
        int i = heap.size() - 1;
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap.get(i).compareTo(heap.get(parent)) >= 0) break;
            swap(i, parent);
            i = parent;
        }
    }

    public T extractMin() {
        if (heap.size() == 0) return null;
        T min = heap.get(0);
        T last = heap.get(heap.size() - 1);
        heap.remove(heap.size() - 1);
        if (heap.size() == 0) return min;
        heap.remove(0);
        heap.add(0, last);
        heapify(0);
        return min;
    }

    private void heapify(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int smallest = i;
        if (left < heap.size() && heap.get(left).compareTo(heap.get(smallest)) < 0)
            smallest = left;
        if (right < heap.size() && heap.get(right).compareTo(heap.get(smallest)) < 0)
            smallest = right;
        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    private void swap(int i, int j) {
        T temp = heap.get(i);
        T valueJ = heap.get(j);
        heap.remove(j);
        heap.add(j, temp);
        heap.remove(i);
        heap.add(i, valueJ);
    }

    public int size() {
        return heap.size();
    }
}

