package fr.astek.romannumbertranslator;

/**
 *
 * @author odupre
 */
public class Translator {

    public int convertRoman(String roman) {
        if (!roman.contains("V") && !roman.contains("X")) {
            return roman.length();
        }
        if (roman.startsWith("V")) {
            return 5 + convertRoman(roman.substring(1));
        }
        if (roman.startsWith("X")) {
            return 10 + convertRoman(roman.substring(1));
        }
        if ("IV".equals(roman)) {
            return 4;
        }

        return 0;
    }

}
