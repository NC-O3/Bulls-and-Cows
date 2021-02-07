import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degreesCelsius = scanner.nextDouble();
        System.out.println(degreesCelsius * 1.8 + 32);
    }
}