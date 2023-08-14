package logicoperators;

/**
 *
 * @author Nathan
 * 
 */

public class LogicOperators {
    
    public static void main(String[] args) {
        
        boolean boo1 = true;
        boolean boo2 = false;
        boolean boo3 = true;
        boolean boo4 = false;
        
        boolean boo5 = boo1 && boo3;
        System.out.println(boo5);
        
        boolean boo6 = boo1 || boo2;
        System.out.println(boo6);
        
        boolean boo7 = boo3 ^ boo4;
        System.out.println(boo7);
        
        boolean boo8 = ! boo4;
        System.out.println(boo8);
        
    }
    
}
