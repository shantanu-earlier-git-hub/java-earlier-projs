package basics.resourcebundles;

import java.io.IOException;
import java.io.InputStream;
import java.util.PropertyResourceBundle;

import static java.util.Comparator.comparing;

public class ResourceBundleExample {

    public static void main(String[] args) throws IOException {

        InputStream fin = ResourceBundleExample.class.getClassLoader().getResourceAsStream("messages.properties");

        var resourceBundle = new PropertyResourceBundle(fin);
        resourceBundle
                .keySet()
                .stream()
                .sorted(comparing(String::valueOf))
                .forEachOrdered(key -> {
                    System.out.println(resourceBundle.getObject(key));
                });

    }
}
