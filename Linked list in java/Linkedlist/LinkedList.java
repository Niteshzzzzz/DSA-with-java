class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {

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
            return Integer.MIN_VALUE;
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
    int removeLast() {
        if (size == 0) {
            System.out.println("Linked list is empty...!!");
            return Integer.MIN_VALUE;
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

    // Reversing linked list
    void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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

    // itrative searching of a key in the linked list
    int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // recursive searching of a key in the linked list

    int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    int recSearch(int key) {
        return helper(head, key);
    }

    // Removing Nth element from the end of the linked list
    void remNthNodefromEnd(int n) {
        int length = 0;
        Node temp = head; 
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (n == length) {
            head = head.next;
            return;
        }

        Node prev = head;
        int i = 1;
        while (i < length -  n) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    // calculatig middle node in linked list
    Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // checking a linked list is palindrome or not
    boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // mid node
        Node mid = findMid(head);

        // reversing right half part
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // comparing left and right part of linked list
        Node left = head;
        Node right = prev;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    // Floyed's algorithm for finding cycle in linked list
    static boolean isCyclic() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // removing cycle from linked list
    static void removeCycle() {
        // checking cycle present or not
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        // if no cycle
        if (cycle == false) {
            return;
        }
        // removing cycle
        Node prev = null;
        slow = head;
        while (slow != fast) {
            prev = fast;
            fast = fast.next;
            slow = slow.next;
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        // l1.addLast(1);
        // l1.addLast(2);
        // l1.addLast(2);
        // l1.addLast(1);
        // l1.display();
        // System.out.println(l1.checkPalindrome());
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(isCyclic());
        removeCycle();
        System.out.println(isCyclic());
        l1.display();

    }
}