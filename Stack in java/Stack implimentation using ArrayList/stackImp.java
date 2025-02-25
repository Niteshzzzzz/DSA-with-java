import java.util.ArrayList;

class Stack {
    static ArrayList<Integer> list = new ArrayList<>();

    // checking stack is empty or not
    static boolean isEmpty() {
        return (list.size() == 0);
    }

    // push operation on the stack
    static void push(int data) {
        list.add(data);
    }

    // pop operation on the stack
    static int pop() {
        if (isEmpty()) {
            return -1;
        }
        int pop = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return pop;
    }

    // checking top of the element(peek element) of the stack
    int peek() {
        if (isEmpty()) {
            return -1;
        }
        return list.get(list.size() - 1);
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