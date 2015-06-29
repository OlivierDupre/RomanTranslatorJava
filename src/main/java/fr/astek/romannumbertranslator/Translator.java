package fr.astek.romannumbertranslator;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author odupre
 */
public class Translator {

    final static Map<String,Integer> romanToDecimal = new HashMap<>();
    static {
        romanToDecimal.put("V", 5);
        romanToDecimal.put("X", 10);
        romanToDecimal.put("L", 50);
        romanToDecimal.put("C", 100);
        romanToDecimal.put("D", 500);
        romanToDecimal.put("M", 1000);
    }
    
    public int convertRoman(String roman) {
        if (roman.isEmpty()){
            return 0;
        }
        
        String start = String.valueOf( roman.charAt(0));
        if(romanToDecimal.containsKey(start)) {
            return romanToDecimal.get(start) + convertRoman(roman.substring(1));
        }
        
        String end = String.valueOf(roman.charAt(roman.length()-1));
        if(romanToDecimal.containsKey(end)) {
            return romanToDecimal.get(end) - convertRoman(roman.substring(0,roman.length()- 1));
        }
              
        return roman.length();
    }
    
    

}
