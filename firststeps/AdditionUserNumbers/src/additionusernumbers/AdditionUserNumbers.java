package additionusernumbers;

import java.util.Scanner;

/**
 *
 * @author Nathan
 * 
 */

public class AdditionUserNumbers {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int uNum = 0;
        String uAns;
        do {
            System.out.print("Enter a number: ");
            uNum += keyboard.nextInt();
            System.out.print("Do you want to continue? [Y/N]: ");
            uAns = keyboard.next();
        } while (uAns.equals("Y"));
        System.out.println("The addition of the all values is: " + uNum + "\nEnd of the program");
    }
    
}
