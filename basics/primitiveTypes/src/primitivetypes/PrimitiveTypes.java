package primitivetypes;

import java.util.Scanner;

public class PrimitiveTypes {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String name = keyboard.nextLine();
        System.out.println("Digite seu saldo:");
        float saldo = (float) keyboard.nextFloat();
        
        System.out.format("O saldo de %s e: %.2f \n", name, saldo);
        
    }
    
}
