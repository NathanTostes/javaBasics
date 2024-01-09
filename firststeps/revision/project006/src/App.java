import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your age: ");
        double age = keyboard.nextDouble();
        
        if (age < 16) {
            System.out.println("You cannot vote");
        }   else {
            if (age >= 18 && age < 70) {
                System.out.println("You are obligated to vote");
            } else {
                System.out.println("Optional vote");
            }
        }

    }
}