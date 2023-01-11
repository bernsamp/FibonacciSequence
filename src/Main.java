import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            System.out.println("\nWelcome to a simple program that outputs the Fibonacci Sequence.\n\nHow many numbers of the Fibonacci Sequence do you want?");

            Scanner scanner = new Scanner(System.in);

            int userInput = scanner.nextInt();

            System.out.println("First " + userInput + " numbers of the Fibonacci Sequence:");

            int i = 1;
            int firstNumber = 0;
            int secondNumber = 1;

            while (i <= userInput) {
                System.out.print(firstNumber + "\n");

                int nextNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = nextNumber;

                i++;
            }
        }
    }

    // For more information regarding the Fibonacci Sequence: https://en.wikipedia.org/wiki/Fibonacci_number