import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        int n = scanner.nextInt();

        if (n > word.length()) {
            System.out.println(word);
        }
        else {
            System.out.println(word.substring(n, word.length()) + word.substring(0, n));
        }

    }
}