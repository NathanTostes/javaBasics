package javavectors;

import java.util.Scanner;

/**
 *
 * @author Nathan
 * 
 */

public class JavaVectors{
    
    public static void main(String [] args){
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Qual o ano atual: ");
        int year = keyboard.nextInt();
        
        String month[] = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
        Integer days[] = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
        
        if (year % 4 == 0){
                System.out.println("\n O ano de " + year + " e bissexto \n");
                days[1] = ++days[1]; 
        }
        
        for (int count = 0; count < month.length; count++){
            System.out.println("Month: " + month[count] + "\n" + "Days: " + days[count] + "\n");
        }

        System.out.println("Total months: " + month.length);
                    
    }
    
}