class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

public class DoubleyLL {
    Node head = null;
    Node tail = null;
    static int size = 0;

    // adding node at the first position of the linked list
    void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // adding node at the last psotion of the linked list
    void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Removing node from the linked list at the first position
    int removeFirst() {
        if (head == null) {
            System.out.println("Linded list is empty...!!!");
            return Integer.MIN_VALUE;
        } else if (head.next == null) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // removing node at the last position of the linked list
    int removeLast() {
        if (head == null) {
            System.out.println("Linded list is empty...!!!");
            return Integer.MIN_VALUE;
        } else if (head.next == null) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    // Displaying the linked list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleyLL dl = new DoubleyLL();
        dl.addFirst(4);
        dl.addFirst(3);
        dl.addFirst(2);
        dl.addFirst(1);
        dl.display();
        System.out.println(size);
        // dl.addLast(5);
        // dl.display();
        // System.out.println(size);
        dl.removeLast();
        dl.display();
        System.out.println(size);
        // dl.removeFirst();
        // dl.display();
        // System.out.println(size);
    }
}
