package javamethods2;

import java.util.Scanner;

/**
 *
 * @author Nathan
 * 
 */

public class JavaMethods2 {
    
    static void addValues(int x, int y){
        int result = x + y;
        System.out.println("The result is: " + result);
    }
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);        
        System.out.print("First value: ");
        int num1 = keyboard.nextInt();
        System.out.print("Second value: ");
        int num2 = keyboard.nextInt();
        
        
        addValues(num1, num2);
        
    }
    
}
