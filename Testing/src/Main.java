import java.util.HashMap;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
//        table.put()
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Cherry");

        // Displaying the Hashtable
        System.out.println("Hashtable: " + table);
        String value = table.get(1);
        System.out.println("Value for key 1: " + value);

        boolean hasKey = table.containsKey(2); // Check if key exists
        boolean hasValue = table.contains("Cherry"); // Check if value exists

        System.out.println("Has key 2? " + hasKey);
        System.out.println("Has value 'Cherry'? " + hasValue);

        table.remove(2); // Removes key 2 and its value
        System.out.println("After removing key 2: " + table);

        for (Integer key : table.keySet()) {
            System.out.println("Key: " + key + ", Value: " + table.get(key));
        }

    }
}