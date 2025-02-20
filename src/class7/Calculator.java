package class7;

public class Calculator {

    private static double calculate (double num1, double num2, char action) {
        switch (action) {
            case '/':
//                if(num2 == 0) {
//                    System.out.println("Can't divide by 0!");
//                    return -999999999;
//                }
                return 8/0;
            case '*':
                return num1*num2;
            case '+':
                return num1+num2;
            case '-':
                return num1-num2;
            default:
                System.out.println("Action not supported");
        }
        return 0;
    }

    public static void main(String[] args) {

        try{
            System.out.println(calculate(5, 0, '/'));
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by 0! " + e.getMessage());
        } finally {
            System.out.println("Finally here!");
        }
    }
}
