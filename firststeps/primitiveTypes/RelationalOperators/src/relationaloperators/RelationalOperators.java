package relationaloperators;

/**
 *
 * @author Nathan
 * 
 */

public class RelationalOperators {

    public static void main(String[] args) {
        
        String name1 = "Nathan";
        String name2 = new String("Nathan");
        
        int res = name1.equals(name2) ? 1 : 0;
        System.out.println(res);
        
        boolean bol1 = 5 > 2;
        boolean bol2 = 5 <= 10;
        boolean bol3 = 5 == 5;
        
    }
    
}
