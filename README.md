# Custom Java Data Structures

✅ Course Project — Full Implementation of Custom List, Stack, Queue, and MinHeap  
📚 Implemented in pure Java, without using java.util.* (except Iterator)

---

## 📦 Implemented Data Structures

### 1. MyArrayList<T>
- Dynamic array implementation
- Supports add, remove, get, clear, and insert by index
- Resizes automatically when full

### 2. MyLinkedList<T>
- Doubly linked list
- Inner class MyNode<T> with prev and next
- Supports safe add/remove/get
- Prevents infinite loops

### 3. MyStack<T>
- Built on MyLinkedList
- LIFO (Last-In, First-Out)
- push(T), pop(), peek(), isEmpty()

### 4. MyQueue<T>
- Built on MyLinkedList
- FIFO (First-In, First-Out)
- enqueue(T), dequeue(), peek(), isEmpty()

### 5. MyMinHeap<T extends Comparable<T>>
- Built on MyArrayList
- Binary heap implementation
- insert(T), extractMin(), size()

---

## 🔧 Technologies Used

- Java (no external libraries)
- IntelliJ IDEA
- Git & GitHub for version control

---

## 💡 Design Decisions

- Used MyArrayList for MyMinHeap (efficient index-based access)
- Used MyLinkedList for Stack & Queue (efficient add/remove at ends)
- All collections are generic and type-safe
- Custom interface MyList<T> ensures structure

---

## 📁 Project Structure

