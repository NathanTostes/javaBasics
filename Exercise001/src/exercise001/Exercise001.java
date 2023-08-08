package exercise001;

import java.util.Date;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.util.Locale;
        
public class Exercise001 {

    public static void main(String[] args) {

        Date clock = new Date();
        System.out.println("A data e a hora do seu sistema e:" + clock);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize();
        int height = (int) screen.getHeight();
        int width = (int) screen.getWidth();
        
        System.out.println("Altura da Tela: " +  height + " px");
        System.out.println("Largura da Tela: " +  width + " px");
        
        Locale data = Locale.getDefault();
        String lang = data.getDisplayLanguage();
        
        System.out.println("A lingua utilizada pelo sistema e: " + lang);
        
    }
    
}