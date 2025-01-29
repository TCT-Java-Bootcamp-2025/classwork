package class5;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        Set<Integer> studentIDs = new HashSet<>();


        //shto elemente
        studentIDs.add(103);
        studentIDs.add(102);
        studentIDs.add(101);

        Set<Integer> studentsToAdd = new HashSet<>();
        studentsToAdd.add(1);
        studentsToAdd.add(2);

        List<Integer> numbersToSort = new ArrayList<>();
        numbersToSort.add(8);
        numbersToSort.add(3);
        numbersToSort.add(9);
        numbersToSort.add(1);

        studentIDs.addAll(studentsToAdd);

        studentIDs.addAll(numbersToSort);

        System.out.println(studentIDs);

        //iterating sets
        for (Integer i : studentIDs) {
            System.out.println(i);
        }

        System.out.println(studentIDs.contains(1));

        studentIDs.removeAll(numbersToSort);

        System.out.println(studentIDs);
    }

}
