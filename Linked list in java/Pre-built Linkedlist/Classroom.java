import java.util.LinkedList;

public class Classroom {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.addFirst(1);
        System.out.println(l1);
        l1.remove(3);
        l1.removeFirst();
        System.out.println(l1);
    }
}
