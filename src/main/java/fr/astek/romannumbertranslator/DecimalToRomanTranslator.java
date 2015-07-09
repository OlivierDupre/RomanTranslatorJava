package fr.astek.romannumbertranslator;

public class DecimalToRomanTranslator {

    public String convertDecimal(int decimal) {
        final StringBuilder result = new StringBuilder("");
        
        if (decimal >= 10) {
            result.append("X");
            decimal = decimal - 10;
            result.append(convertDecimal(decimal));
            
            return result.toString();
        }

        if (decimal >= 5) {
            result.append("V");
            decimal = decimal - 5;
        }

        for (int i = 0; i < decimal; i++) {
            result.append("I");
        }

        return result.toString();
    }
}
