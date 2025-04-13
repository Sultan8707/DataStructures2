public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Stack pop: " + stack.pop());

        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("one");
        queue.enqueue("two");
        System.out.println("Queue dequeue: " + queue.dequeue());

        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(5);
        heap.insert(2);
        heap.insert(8);
        System.out.println("Heap extractMin: " + heap.extractMin());
    }
}
