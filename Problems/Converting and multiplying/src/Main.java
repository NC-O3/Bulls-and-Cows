import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.next();
        ArrayList<String> arrayList = new ArrayList<>();

        while (!line.equals("0")) {

            try {
                int number = Integer.parseInt(line) * 10;
                arrayList.add(Integer.toString(number));
            }
            catch (Exception e) {
                arrayList.add("Invalid user input: " + line);
            }

            line  = scanner.next();
        }

        for (String s : arrayList) {
            System.out.println(s);
        }

    }
}