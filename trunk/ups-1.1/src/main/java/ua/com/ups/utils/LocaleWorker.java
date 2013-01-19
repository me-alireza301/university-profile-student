package ua.com.ups.utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleWorker {

    public static ResourceBundle getResourceBundle(Locale locale){
        return ResourceBundle.getBundle("messages", locale);
    }

}
