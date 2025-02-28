import java.util.Stack;

public class Stock_span {

    static void stockSpan(int stock[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        for (int i = 0; i < stock.length; i++) {
            int currStock = stock[i];
            while (!s.isEmpty() && currStock > stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i+1;
            } else {
                span[i] = i - s.peek();
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stock[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stock.length];
        stockSpan(stock, span);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i]+" ");
        }
    }
}
