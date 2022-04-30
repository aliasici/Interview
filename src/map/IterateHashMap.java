package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashMap {
    public static void main(String[] args) {

        // Creating a HashMap
        HashMap<String, String> languages = new HashMap<>();
        languages.put("Java", "Enterprise");
        languages.put("Python", "ML/AI");
        languages.put("JavaScript", "Frontend");
        System.out.println("HashMap: " + languages);

        // iterating through key/value mappings
        System.out.print("Entries: ");
        for (Entry<String, String> entry : languages.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }

        // iterating through keys
        System.out.print("\nKeys: ");
        for (String key : languages.keySet()) {
            System.out.print(key);
            System.out.print(", ");
        }
   //    System.out.println("\nKeys: " + languages.keySet());

        // iterating through values
        System.out.print("\nValues: ");
        for (String value : languages.values()) {
            System.out.print(value);
            System.out.print(", ");
        }

//        Example 2: Iterate through HashMap using iterator()
        // create a HashMap
        HashMap<String, String> languages2 = new HashMap<>();
        languages2.put("Java", "Enterprise");
        languages2.put("Python", "ML/AI");
        languages2.put("JavaScript", "Frontend");
        languages2.put("Cypress", "Test");
        System.out.println("HashMap: " + languages);

        // create an object of Iterator
        Iterator<Entry<String, String>> iterate1 = languages2.entrySet().iterator();

        // iterate through key/value mappings
        System.out.print("Entries: ");
        while (iterate1.hasNext()) {
            System.out.print(iterate1.next());
            System.out.print(", ");
        }

        // iterate through keys
        Iterator<String> iterate2 = languages2.keySet().iterator();
        System.out.print("\nKeys: ");
        while (iterate2.hasNext()) {
            System.out.print(iterate2.next());
            System.out.print(", ");
        }

        // iterate through values
        Iterator<String> iterate3 = languages2.values().iterator();
        System.out.print("\nValues: ");
        while (iterate3.hasNext()) {
            System.out.print(iterate3.next());
            System.out.print(", ");
        }
        System.out.println();

//        We can use the get() method to access the value from the hashmap. For example
        String value = languages.get("Java");
        String value2 = languages2.get("Cypress");

        System.out.println("value = " + value);
        System.out.println("value2 = " + value2);
        System.out.println("+++++++++++++++++++++++++++++++++++");
        // return set view of keys
        // using keySet()
        System.out.println("Keys: " + languages.keySet());

        // return set view of values
        // using values()
        System.out.println("Values: " + languages.values());

        // return set view of key/value pairs
        // using entrySet()
        System.out.println("Key/Value mappings: " + languages.entrySet());

        System.out.println("+++++++++++++++++++++++++++++++++++");
        HashMap<Integer, String> languages3 = new HashMap<>();
        languages3.put(1, "Java");
        languages3.put(2, "Python");
        languages3.put(3, "JavaScript");
        System.out.println("Original HashMap: " + languages3);

        // change element with key 2
        languages3.replace(2, "C++");
        System.out.println("HashMap using replace(): " + languages3);
    }
}


