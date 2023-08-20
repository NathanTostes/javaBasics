package structuresofrepeat;

/**
 *
 * @author Nathan
 * 
 */

public class StructuresOfRepeat {

    public static void main(String[] args) {
        
        int cont = -1;
        
        while (cont < 10){
            cont++;
            if (cont == 9){
                break;
            }
            if (cont % 2 == 1){
                continue;
            }
            System.out.println(cont);
        }
        
    }
    
}
