package class7;

import java.util.Arrays;
import java.util.List;

public class StudentsUsingStreams {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 20, 9.5),
                new Student("Bob", 22, 7.0),
                new Student("Charlie", 21, 8.2),
                new Student("David", 23, 6.5)
        );

        // TODO: Use streams to filter, sort, and transform students
    }
}
