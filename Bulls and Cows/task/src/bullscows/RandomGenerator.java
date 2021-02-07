package bullscows;

import java.util.Random;

public class RandomGenerator {

    private int length;
    private char[] generatedCode;
    private int possibleSymbols;

    public RandomGenerator(int length, int possibleSymbols) {
        this.length = length;
        this.possibleSymbols = possibleSymbols;
        generatedCode = new char[length];
    }

    public char[] getGeneratedCode() {
        return generatedCode;
    }

    public void generate() {
        int counter = 0;
        Random random = new Random();
        int bound = possibleSymbols <= 10 ? 10 : 75;
        int difference = possibleSymbols <= 10 ? (57 - possibleSymbols) : (48 - possibleSymbols);
        while (counter != length) {

            int randomAsciiNumber = random.nextInt(bound) + difference + 1;
            if ((randomAsciiNumber >= 48 && randomAsciiNumber <= 57) || (randomAsciiNumber >= 97 && randomAsciiNumber <= 122)) {

                boolean checkIfExists = false;
                for (int i = 0; i < counter; i++) {
                    if (generatedCode[i] == (char) randomAsciiNumber) {
                        checkIfExists = true;
                        break;
                    }
                }

                if (!checkIfExists) {
                    generatedCode[counter] = (char) randomAsciiNumber;
                    counter++;
                }

            }

        }
    }

}
