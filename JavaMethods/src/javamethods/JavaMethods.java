package javamethods;

import java.util.Scanner;

/**
 *
 * @author Nathan
 * 
 */

public class JavaMethods {
    
    public static int addValues(int a, int b){
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("First value: ");
        int num1 = keyboard.nextInt();
        System.out.print("\nSecond value: ");
        int num2 = keyboard.nextInt();
        System.out.println("");
        
        int addResult = addValues(num1, num2);
        System.out.println("A soma entre os valores resulta em: " + addResult);
        
    }
    
}
