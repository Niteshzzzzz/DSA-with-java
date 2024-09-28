import java.util.*;

public class arrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(20);
        System.out.println(l1);
        l1.add(40);

        // print arrayList by index value
        System.out.println(l1.get(1));

        //take value in arrayList by loop
        for (int i = 0; i < 9; i++) {
            l1.add(i);
        }

        //print arrayList directly
        System.out.println(l1);

        //print ArrayList by loop
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        // add an element at a specific index
        l1.add(2, 11);
        System.out.println(l1);

        // modify elements using index
        l1.set(2, 44);
        System.out.println(l1);

        // remove element using index
        l1.remove(2);
        System.out.println(l1);

        // remove element using its value
        l1.remove(Integer.valueOf(2));
        System.out.println(l1);
        
        // checking if a element exist or not
        boolean ans = l1.contains(Integer.valueOf(3));
        System.out.println(ans);

        // insering different datatype values in arrayList
        ArrayList l2 = new ArrayList();
        l2.add("Nitesh kumar");
        l2.add(true);
        l2.add(435332);
        l2.add(34.5434f);
        System.out.println(l2);

        boolean ans1 = l1.isEmpty();
        System.out.println(ans1);

        System.out.println(l1.indexOf(Integer.valueOf(5)));
    }
}
