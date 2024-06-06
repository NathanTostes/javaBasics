package structuresofrepeat2;

import java.util.Scanner;

/**
 *
 * @author Nathan
 * 
 */

public class StructuresOfRepeat2 {

    public static void main(String[] args) {
        int count = 1;
        do {            
            System.out.println(count);
            ++count;
        } while (count <= 5);
        
        System.out.println("\n \n \n");
       
        Scanner keyboard = new Scanner(System.in);
        int uNum = keyboard.nextInt();
        do {
            --uNum;
            System.out.println(uNum);
        } while(uNum > 0);
    }
    
}
