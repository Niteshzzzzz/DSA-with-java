class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {

    Node head;
    Node tail;
    static int size;

    // adding node in linked list at the first position
    void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // adding node in linked list at the last position
    void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // adding element on a particular point in Linked list
    void add(int index, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            addFirst(data);
            return;
        }
        size++;
        int i = 0;
        Node temp = head;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Removing first element form the linked list
    int removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty...!!");
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Removing last node form the linked list
    int removeLast(){
        if (size == 0) {
            System.out.println("Linked list is empty...!!");
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev; 
        size--;
        return val;
    }

    // printin the linked list
    void display() {
        if (head == null) {
            System.out.println("Linked list is empty...!!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.display();
        l1.addFirst(3);
        l1.addFirst(56);
        l1.display();
        l1.addFirst(98);
        l1.addFirst(9);
        l1.display();
        l1.addLast(4);
        l1.addLast(7);
        l1.addLast(44);
        l1.display();
        l1.add(2, 6);
        l1.display();
        System.out.println(l1.size);
        l1.removeFirst();
        l1.display();
        System.out.println(l1.size);
        l1.removeLast();
        l1.display();
        System.out.println(l1.size);
    }
}