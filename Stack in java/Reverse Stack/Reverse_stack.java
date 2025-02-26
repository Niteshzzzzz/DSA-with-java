import java.util.Stack;

public class Reverse_stack {

    static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int pop = s.pop();
        pushAtBottom(s, data);
        s.push(pop);
    }

    static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int pop = s.pop();
        reverseStack(s);
        pushAtBottom(s, pop);
    }

    static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverseStack(s);
        printStack(s);
    }
}
