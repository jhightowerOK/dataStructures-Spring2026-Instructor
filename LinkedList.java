public class LinkedList<T> {

    // ── Inner Node class ─────────────────────────────────────────
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // ── Fields ───────────────────────────────────────────────────
    private Node<T> head;
    private int size;

    // ── Constructor ──────────────────────────────────────────────
    public LinkedList() {
        head = null;
        size = 0;
    }

    // ── Insert at head — O(1) ────────────────────────────────────
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // ── Insert at tail — O(n) ────────────────────────────────────
    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // ── Remove from head — O(1) ──────────────────────────────────
    public T removeFirst() {
        if (head == null) throw new RuntimeException("List is empty");
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    // ── Remove from tail — O(n) ──────────────────────────────────
    public T removeLast() {
        if (head == null) throw new RuntimeException("List is empty");
        if (head.next == null) {
            T data = head.data;
            head = null;
            size--;
            return data;
        }
        Node<T> current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        T data = current.next.data;
        current.next = null;
        size--;
        return data;
    }

    // ── Search — O(n) ────────────────────────────────────────────
    public boolean contains(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) return true;
            current = current.next;
        }
        return false;
    }

    // ── Accessors ─────────────────────────────────────────────────
    public int size()        { return size; }
    public boolean isEmpty() { return size == 0; }

    // ── Print list ────────────────────────────────────────────────
    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    // ── Main — quick demo ─────────────────────────────────────────
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addFirst(0);

        list.print();                                      // 0 -> 1 -> 2 -> 3
        System.out.println("Size: "     + list.size());   // 4
        System.out.println("Contains 2: " + list.contains(2)); // true

        list.removeFirst();
        list.removeLast();
        list.print();                                      // 1 -> 2
    }
}