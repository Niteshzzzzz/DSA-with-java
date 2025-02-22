class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {

    static Node head;
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

    // finding middle mode of the linked list
    private static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // merge algorithm
    private static Node merge(Node leftNode, Node rightNode) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while (leftNode != null && rightNode != null) {
            if (leftNode.data < rightNode.data) {
                temp.next = leftNode;
                leftNode = leftNode.next;
                temp = temp.next;
            } else {
                temp.next = rightNode;
                rightNode = rightNode.next;
                temp = temp.next;
            }
        }
        while (leftNode != null) {
            temp.next = leftNode;
            temp = temp.next;
            leftNode = leftNode.next;
        }
        while (rightNode != null) {
            temp.next = rightNode;
            rightNode = rightNode.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    // merge sort
    static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find middle node
        Node mid = findMid(head);
        // call mergeSort for left and ringht part or linked list
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge logic
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(5);
        l1.addLast(4);
        l1.addLast(3);
        l1.addLast(2);
        l1.addLast(1);
        l1.display();
        l1.head = l1.mergeSort(l1.head);
        l1.display();
    }
}
