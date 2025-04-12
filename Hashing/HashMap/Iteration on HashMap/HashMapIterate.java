import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapIterate {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("china", 32);
        hm.put("india", 12);
        hm.put("usa", 2);
        hm.put("japan", 2);
        System.out.println(hm);

        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println(k+": "+hm.get(k));
        }

        Set<Map.Entry<String, Integer>> set = hm.entrySet();
        System.out.println(set);

        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        
    }
}
