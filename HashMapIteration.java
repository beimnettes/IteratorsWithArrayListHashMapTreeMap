import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();

        // Populate the HashMap
        inventory.put("Books", 12);
        inventory.put("Movies", 8);
        inventory.put("Games", 5);
        inventory.put("Clothes", 20);
        inventory.put("Shoes", 15);

        System.out.println("Original HashMap: " + inventory);

        // Iterate using an iterator
        Iterator<Map.Entry<String, Integer>> iterator = inventory.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Category: " + entry.getKey() + ", Count: " + entry.getValue());

            // Modify values during iteration
            if (entry.getKey().equals("Books")) {
                entry.setValue(entry.getValue() + 5);
            }

            // Remove an entry safely
            if (entry.getKey().equals("Games")) {
                iterator.remove();
            }
        }

        System.out.println("Updated HashMap: " + inventory);
    }
}
