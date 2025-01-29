package class5;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> studentRegistry = new HashMap<>();

        //shto te dhena
        studentRegistry.put(1, "Alice");
        studentRegistry.put(1, "Bob");

        studentRegistry.putIfAbsent(1, "Susan");

        System.out.println(studentRegistry.containsKey(1));
        System.out.println(studentRegistry.containsValue("Susan"));

        System.out.println(studentRegistry.get(3)); // Outputs: Alice

        System.out.println(studentRegistry.getOrDefault(2, "default value"));

        //      Example Code (Iterating through Map)

        for (Map.Entry<Integer, String> entry : studentRegistry.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        for (Integer i : studentRegistry.keySet()) {
            System.out.println("ID:" + i);
        }

        System.out.println(studentRegistry.values());

    }
}
