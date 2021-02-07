import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distance1 = scanner.nextDouble();
        double hours = scanner.nextDouble();

        System.out.println(distance1/ hours);
    }
}