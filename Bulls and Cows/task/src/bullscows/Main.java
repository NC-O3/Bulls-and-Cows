package bullscows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the length of the secret code:");
        String numberLengthString = scanner.next();

        System.out.println("Input the number of possible symbols:");
        String symbolsString = scanner.next();

        try {
            int numberLength = Integer.parseInt(numberLengthString);
            int symbols = Integer.parseInt(symbolsString);

            if (numberLength <= 0) {
                System.out.println("Error: the length should have a positive value.");
            }
            else if (symbols <= 0) {
                System.out.println("Error: the number of symbols should be positive and bigger than the length of the code.");
            }
            else if (symbols < numberLength) {
                System.out.println(String.format("Error: it's not possible to generate a code with a length of %d with %d unique symbols.", numberLength, symbols));
            } else if (symbols > 36) {
                System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            } else {


                char finalLetter = (char) (97 + symbols - 11);

                RandomGenerator randomGenerator = new RandomGenerator(numberLength, symbols);
                randomGenerator.generate();

                System.out.print("The secret code is prepared: ");
                for (int i = 0; i < numberLength; i++) {
                    System.out.print('*');
                }
                System.out.print(' ');
                System.out.print(String.format("(0-9, a-%c).%n", finalLetter));

                Grader grader = new Grader(randomGenerator.getGeneratedCode(), numberLength);

                boolean isGuessed = false;
                int counter = 1;
                System.out.println("Okay, let's start a game!");
                while (!isGuessed) {
                    System.out.println(String.format("Turn %d:", counter));
                    String secretCodeString = scanner.next();
                    char[] secretCode = secretCodeString.toCharArray();
                    isGuessed = grader.grade(secretCode);
                    counter++;
                }

            }
        }
        catch (NumberFormatException e) {
            System.out.println(String.format("Error: \"%s\" isn't a valid number.", symbolsString));
        }
    }

}
