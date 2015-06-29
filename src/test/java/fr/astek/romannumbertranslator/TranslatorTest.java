package fr.astek.romannumbertranslator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author odupre
 */
public class TranslatorTest {

    public TranslatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @org.junit.Test
    public void testConvertRoman1() {
        String roman = "I";
        Translator instance = new Translator();
        int result = instance.convertRoman(roman);
        assertEquals(1, result);
    }

    @org.junit.Test
    public void voidConvertRoman2() {
        Translator instance = new Translator();
        int result = instance.convertRoman("II");
        assertEquals(2, result);
    }

    @org.junit.Test
    public void voidConvertRoman3() {
        Translator instance = new Translator();
        int result = instance.convertRoman("III");
        assertEquals(3, result);
    }

    @org.junit.Test
    public void voidConvertRoman4() {
        Translator instance = new Translator();
        int result = instance.convertRoman("IV");
        assertEquals(4, result);
    }

    @org.junit.Test
    public void voidConvertRoman5() {
        Translator instance = new Translator();
        int result = instance.convertRoman("V");
        assertEquals(5, result);
    }

    @org.junit.Test
    public void voidConvertRoman6() {
        Translator instance = new Translator();
        int result = instance.convertRoman("VI");
        assertEquals(6, result);
    }
    
    @org.junit.Test
    public void voidConvertRoman10() {
        Translator instance = new Translator();
        int result = instance.convertRoman("X");
        assertEquals(10, result);
    }

    @org.junit.Test
    public void voidConvertRoman11() {
        Translator instance = new Translator();
        int result = instance.convertRoman("XI");
        assertEquals(11, result);
    }

}
