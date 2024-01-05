package javavectors3;

import java.util.Arrays;

/**
 * 
 * @author Nathan
 * 
 */

public class JavaVectors3 {

    public static void main(String[] args) {
        
        int numbers[] = {3, 5, 9, 8, 1, 4, 2, 6, 7, 0};
        for (int values: numbers){
        System.out.print(values + " ");
        }
        
        int position = Arrays.binarySearch(numbers, 1);
        System.out.println("\nThe positon of the number 0 is: " + position);
        
        Arrays.sort(numbers);
        
        for (int value: numbers){
            System.out.println("Number: " + value);
        }
        
        int nine[] = new int[10];
        Arrays.fill(nine, 9);
        for (int valuess: nine){
            System.out.print(valuess);
        }
        
    }
    
}
