package systemresolution;

import java.awt.Dimension;
import java.awt.Toolkit;

public class SystemResolution {

    public static void main(String[] args) {
        
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        
        int width = (int)size.getWidth();
        int height = (int)size.getHeight();
        
        System.out.println("Altura da Tela: " + height + " px");
        System.out.println("Largura da Tela: " + width + " px");
        
    }
    
}
