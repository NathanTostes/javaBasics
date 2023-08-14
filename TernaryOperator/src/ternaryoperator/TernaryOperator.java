package ternaryoperator;

/**
 *
 * @author Nathan
 * 
 */

public class TernaryOperator {

    public static void main(String[] args) {
        
        int num1, num2, res;
        num1 = 4;
        num2 = 8;
        
        res = num1 > num2 ? 1 : 0;
        boolean bol = res != 0;
        System.out.println(res);
        System.out.println(bol);
        
    }
    
}
