package usingmathclass;

/**
 * @author Nathan
 */

public class UsingMathClass {

    public static void main(String[] args) {
        
        // Raíz Quadrada
        int num1 = 100;
        int root = (int) Math.sqrt(num1);
        System.out.println(root);
        
        // Arredondamento
        double num2 = 20.6;
        int rounding = (int) Math.round(num2);
        System.out.println(rounding);
        
        // Número aleatório
        double random = Math.random();
        int aleatorio = (int) (random * 11);
        System.out.println(aleatorio);
        
    }
    
}
