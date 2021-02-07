package bullscows;

public class Grader {

    private char[] secretCode;
    private int secretCodeLength;

    public Grader(char[] secretCode, int secretCodeLength) {
        this.secretCode = secretCode;
        this.secretCodeLength = secretCodeLength;
    }

    public boolean grade(char[] secretCode) {

        boolean toGrade = false;

        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < secretCodeLength; i++) {
            if (this.secretCode[i] == secretCode[i]) {
                bulls++;
            } else {
                for (int j = 0; j < secretCodeLength; j++) {
                    if (j == i)
                        continue;
                    if (this.secretCode[i] == secretCode[j]) {
                        cows++;
                        break;
                    }
                }
            }
        }

        if (bulls == 4) {
            System.out.println(String.format("Grade: %d bulls", secretCodeLength));
            System.out.println("Congratulations! You guessed the secret code.");
            toGrade = true;
        }
        else {
            if (bulls == 1 && cows == 1) {
                System.out.println("Grade: 1 bull and 1 cow");
            }
            else if (bulls == 1) {
                System.out.println(String.format("Grade: 1 bull and %d cows", cows));
            }
            else if (cows == 1) {
                System.out.println(String.format("Grade: %d bulls and 1 cow", bulls));
            }
            else {
                System.out.println(String.format("Grade: %d bulls and %d cows", bulls, cows));
            }
        }

        return toGrade;
    }

}
