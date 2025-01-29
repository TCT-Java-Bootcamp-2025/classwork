package class5;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        System.out.println(students.get(1)); // Outputs: Bob

//      Example Code (Iterating through List)
        for (String student : students) {
            System.out.println(student);
        }


        Set<Integer> studentIDs = new HashSet<>();
        studentIDs.add(101);
        studentIDs.add(102);
        studentIDs.add(101); // Duplicate ignored


        //Example Code: search in Set

        System.out.println("Contains 102? " + studentIDs.contains(102));


        Map<Integer, String> studentRegistry = new HashMap<>();
        studentRegistry.put(1, "Alice");
        System.out.println(studentRegistry.get(1)); // Outputs: Alice


        //      Example Code (Iterating through Map)

        for (Map.Entry<Integer, String> entry : studentRegistry.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }


    }
}
