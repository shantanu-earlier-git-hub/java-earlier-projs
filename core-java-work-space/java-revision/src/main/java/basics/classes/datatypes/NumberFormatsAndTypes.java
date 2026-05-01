package basics.classes.datatypes;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatsAndTypes {

    public static void main(String[] args) {

        //int amount = 1_00_000;

        double amount = 12.34;

        //double value = 1_00.0_0;
        //float floatV = 1_00.0_0f;

        Locale.availableLocales()
                .forEach(locale -> {
                    NumberFormat numberFormat = NumberFormat.getInstance(locale);
                    System.out.println(
                            " locale = [ " + locale.getDisplayName() + " ] -> formatted value = " + numberFormat.format(amount));
                });


    }
}
