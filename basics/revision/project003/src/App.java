import java.util.Scanner;

public class App {

    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = Integer.parseInt(keyboard.nextLine());
        System.out.println("\n");
        System.out.print("Enter another number: ");
        int num2 = Integer.parseInt(keyboard.nextLine());
        System.out.printf("The division between the numbers is: %d \n", num1 / num2);
        System.out.printf("The rest of division is: %d \n", num1 % num2);
        
    }

}