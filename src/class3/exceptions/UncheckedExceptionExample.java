package class3.exceptions;

public class UncheckedExceptionExample {

    public static void main(String[] args) {

        try {
            int nums [] = new int[2];

            int result = 10 / 0; // Throws ArithmeticException
            System.out.println(nums[4]);

        }
//        catch (IndexOutOfBoundsException indexOutOfBoundsException ) {
//            System.out.println("Error2:" + indexOutOfBoundsException.getMessage());
//        } catch (ArithmeticException e) {
//            System.out.println("Error: " + e.getMessage());
//        }

//        catch (IndexOutOfBoundsException | ArithmeticException e) {
//                System.out.println("Error:" + e.getMessage());
//        }

        catch (ArithmeticException e) {
            System.out.println("0 is not a valid value: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Cleanup code.");
        }
    }
}
