package javavectors;

/**
 *
 * @author Nathan
 * 
 */

public class JavaVectors {
    
    public static void main(String[] args) {
        
        int nums[] = {2, 5, 8, 11, 16, 23, 34, 49, 52};
        for(int count = 0; count <=8; ++count){
            System.out.println("In position (" + count + ") the value is: " + nums[count]);
        }
        System.out.println("The space of Vector is: " + nums.length);
        
    }
    
}
