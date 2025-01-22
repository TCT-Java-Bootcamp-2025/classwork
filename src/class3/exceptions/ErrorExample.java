package class3.exceptions;

public class ErrorExample {
    public static void main(String[] args) {
        main(args); // Recursive call causes StackOverflowError
    }
}
