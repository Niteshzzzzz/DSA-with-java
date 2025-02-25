class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    static Node head = null;

    // checking stack is empty or not
    static boolean isEmpty() {
        return (head == null);
    }

    // push operation on the stack
    static void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // pop operation on the stack
    static int pop() {
        if (isEmpty()) {
            return -1;
        }
        int pop = head.data;
        head = head.next;
        return pop;
    }

    // checking top of the element(peek element) of the stack
    int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }
}

public class stackImp {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}