package voteverificator;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Nathan
 * 
 */

public class VoteVerificator {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Digite o seu ano de nacimento: ");
        int birthYear = keyboard.nextInt();
        System.out.println();
        
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        
        int age = currentYear - birthYear;
        
        if (age >= 18 && age <= 70){
            
            System.out.println("Obrigatory vote");
            System.out.println(joog);
            
        } else {
            
            if (age < 16){
                
                System.out.println("Not can vote");
                
            } else {
                
                System.out.println("Optional vote");
                
            }
            
        }
        
    }
    
}
