import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String date = scanner.nextLine();

        String[] words = date.split("-");

        System.out.println(words[1] + "/" + words[2] + "/" + words[0]);

    }
}