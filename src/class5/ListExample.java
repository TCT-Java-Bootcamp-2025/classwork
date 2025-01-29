package class5;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Alice");

        List<Integer> numbersToSort = new ArrayList<>();
        numbersToSort.add(8);
        numbersToSort.add(3);
        numbersToSort.add(9);
        numbersToSort.add(1);

        Collections.sort(students);
        System.out.println(students);
        numbersToSort.sort(Comparator.reverseOrder());
        //1, 3, 8, 9
        System.out.println(numbersToSort);

        for(int i = 0; i<numbersToSort.size(); i++){
            for (int j = 0; j<numbersToSort.size(); j ++) {
                if (numbersToSort.get(i)< numbersToSort.get(j)){
                    int temp= numbersToSort.get(i);
                    numbersToSort.set(i, numbersToSort.get(j));
                    numbersToSort.set(j, temp);

                  //  System.out.println(numbersToSort.get(i));
                    //System.out.println(numbersToSort.get(j));
                    System.out.println("sorted" + numbersToSort);
                }
            }
        }

//        System.out.println(students.get(1)); // Outputs: Bob
//
//        students.remove("Alice");
//        students.remove(0);
//
//        List<String> namesToRemove = new ArrayList<>();
//        namesToRemove.add("Alice");
//        namesToRemove.add("Bob");
//
//        students.removeAll(namesToRemove);
       // System.out.println(students);

//      Example Code (Iterating through List)
        //for (String student : students) {
          //  System.out.println(student);
        //}

       // for (int i = 0; i<students.size(); i++) {
         //   System.out.println(students.get(i));
        //}


    }




}
