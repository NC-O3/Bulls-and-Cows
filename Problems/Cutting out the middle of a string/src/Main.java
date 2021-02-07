import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        StringBuilder str = new StringBuilder(line);

        if (line.length() % 2 == 0) {
            str.delete(line.length() / 2 - 1, line.length() / 2 + 1);
        }
        else {
            str.deleteCharAt(line.length() / 2);
        }

        System.out.println(str.toString());

    }
}