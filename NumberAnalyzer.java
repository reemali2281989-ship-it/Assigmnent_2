import java.util.Scanner;

public class NumberAnalyzer {

    /**
     * Prints numbers from 10 down to 1.
     */
    public static void printNumbersDescending() {

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

    }

    /**
     * Displays numbers from 1 to 10 and shows
     * whether each number is even or odd.
     */
    public static void printEvenOrOdd() {

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " -> Even");
            } else {
                System.out.println(i + " -> Odd");
            }

        }

    }

    /**
     * Determines the type of a number.
     *
     * @param number the number entered by the user
     * @return Positive, Negative, or Zero
     */
    public static String checkNumberType(int number) {

        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }

    }

    /**
     * Calculates the sum of two integers.
     *
     * @param number1 first number
     * @param number2 second number
     * @return the sum of both numbers
     */
    public static int calculateSum(int number1, int number2) {

        return number1 + number2;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        do {

            System.out.println("=========================");
            System.out.println("Number Analyzer Menu");
            System.out.println("=========================");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd Report");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");
            System.out.println("=========================");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    printNumbersDescending();
                    break;

                case 2:
                    printEvenOrOdd();
                    break;

                case 3:

                    System.out.print("Enter a number: ");
                    int number = input.nextInt();

                    System.out.println(
                            checkNumberType(number));

                    break;

                case 4:

                    System.out.print("Enter first number: ");
                    int number1 = input.nextInt();

                    System.out.print("Enter second number: ");
                    int number2 = input.nextInt();

                    System.out.println(
                            "Sum = "
                                    + calculateSum(number1, number2));

                    break;

                case 5:

                    System.out.println(
                            "Thank you for using Number Analyzer.");

                    break;

                default:

                    System.out.println("Invalid Choice");

            }

        } while (choice != 5);

        input.close();

    }

}