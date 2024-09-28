import java.util.ArrayList;
import java.util.Collections;

public class arrayListReverse {

    static void listReverse(ArrayList<Integer> list){
        int i = 0,j = list.size()-1;
        while (i<j) {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(872);
        list.add(9);
        list.add(2);
        list.add(98);
        list.add(6);
        list.add(78);
        list.add(45);

        System.out.println("list without reverse: "+ list);
        listReverse(list);
        System.out.println("list after reverse: "+list);
        Collections.reverse(list);
        System.out.println("list after reverse: "+list);
    
        // sort method - ascen
        Collections.sort(list);
        System.out.println("Sorted list: "+list);

        // sort method - desc
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // string sorting
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Nitesh");
        l1.add("Kumar");
        l1.add("How");
        l1.add("are");
        l1.add("you?");
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println("Asce sort: "+l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Desc sort: "+l1);
    }
}
