
package systemlang;

import java.util.Locale;

public class SystemLang {

    public static void main(String[] args) {
        
        Locale currentLocale = Locale.getDefault();
        System.out.println(currentLocale.getDisplayLanguage());
        
    }
    
}
