import java.util.HashMap;

public class BasicOperation {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Tea", 10);
        hm.put("Samosa", 1);
        hm.put("Pizza", 250);
        hm.put("Burger", 50);
        hm.put("Coffee", 50);

        System.out.println(hm);

        System.out.println(hm.get("Pizza"));
        System.out.println(hm.containsKey("Jalebi"));
        System.out.println(hm.remove("Tea"));
        System.out.println(hm);
        System.out.println(hm.size());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}