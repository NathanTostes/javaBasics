import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int total = 0, num;
        String progress = new String("Y");
        try (Scanner keyboard = new Scanner(System.in)) {
            while (progress.contentEquals("Y")) {
                    num = keyboard.nextInt();
                    total += num;
                    System.out.println("Continue?(Y/N)");
                    progress = keyboard.next();
                }
        }

        System.out.println("The total is: " +  total);
    }
}
