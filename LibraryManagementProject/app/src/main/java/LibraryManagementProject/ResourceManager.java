package LibraryManagementProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceManager {

    private static Locale currentLocale = Locale.ENGLISH;
    private static List<LanguageChangeListener> listeners = new ArrayList<>();

    public static void setLocale(Locale locale) {
        currentLocale = locale;
        notifyListeners();
    }

    public static Locale getLocale() {
        return currentLocale;
    }

    public static ResourceBundle getBundle(String baseName) {
        return ResourceBundle.getBundle(baseName, currentLocale);
    }

    public static void addLanguageChangeListener(LanguageChangeListener listener) {
        listeners.add(listener);
    }

    private static void notifyListeners() {
        for (LanguageChangeListener listener : listeners) {
            listener.languageChanged();
        }
    }
}
