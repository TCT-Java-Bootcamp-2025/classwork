package class1.quiz2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kenny", 23, 140);

        Student person = student;
        Student object = student;

        System.out.print(student + ", ");
        System.out.print(person + ", ");
        System.out.println(object);
    }

}
