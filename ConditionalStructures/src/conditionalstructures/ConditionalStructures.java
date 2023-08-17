package conditionalstructures;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Nathan
 * 
 */

public class ConditionalStructures {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        float nota1 = keyboard.nextFloat();
        float nota2 = keyboard.nextFloat();
        
        float media = (nota1 + nota2) / 2;
        
        if (media >= 6){
            System.out.println("You are approved \nYour media is: " + media);
        } else {
            System.out.println("You are not approved \n Your media is: " + media);
        }
        
    }
    
}