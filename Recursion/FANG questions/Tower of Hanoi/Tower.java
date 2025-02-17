
public class Tower {

    public static void toh(int n, char from_road, char to_road, char aux_road) {
        if (n == 1) {
            System.out.println("Moving disk 1 from "+from_road + " to " + to_road);
            return;
        }

        toh(n - 1, from_road, aux_road, to_road);
        System.out.println("Moving disk " + n + " from " + from_road + " to " + to_road);
        toh(n - 1, aux_road, to_road, from_road);
    }
    
    public static void main(String[] args) {
        int n = 3;
        toh(n, 'A', 'C', 'B');
    }
}
