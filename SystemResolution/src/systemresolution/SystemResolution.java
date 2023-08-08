package systemresolution;

import java.awt.Dimension;
import java.awt.Toolkit;

public class SystemResolution {

    public static void main(String[] args) {
        
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        
        int width = (int)size.getWidth();
        int height = (int)size.getHeight();
        
        System.out.print("Altura da Tela: ");
        System.out.print(height );
        System.out.println(" px");
        System.out.print("Largura da Tela: ");
        System.out.print(width);
        System.out.println(" px");
        
    }
    
}
