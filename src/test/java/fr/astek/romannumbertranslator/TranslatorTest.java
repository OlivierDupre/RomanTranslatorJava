package fr.astek.romannumbertranslator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author odupre
 */
public class TranslatorTest {

    private Translator instance;

    @Before
    public void setUp() {
        instance = new Translator();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testConvertRoman1() {
        int result = instance.convertRoman("I");
        assertEquals(1, result);
    }

    @Test
    public void voidConvertRoman2() {
        int result = instance.convertRoman("II");
        assertEquals(2, result);
    }

    @Test
    public void voidConvertRoman3() {
        int result = instance.convertRoman("III");
        assertEquals(3, result);
    }

    @Test
    public void voidConvertRoman4() {
        int result = instance.convertRoman("IV");
        assertEquals(4, result);
    }

    @Test
    public void voidConvertRoman5() {
        int result = instance.convertRoman("V");
        assertEquals(5, result);
    }

    @Test
    public void voidConvertRoman6() {
        int result = instance.convertRoman("VI");
        assertEquals(6, result);
    }

    @Test
    public void voidConvertRoman9() {
        int result = instance.convertRoman("IX");
        assertEquals(9, result);
    }

    @Test
    public void voidConvertRoman10() {
        int result = instance.convertRoman("X");
        assertEquals(10, result);
    }

    @Test
    public void voidConvertRoman11() {
        int result = instance.convertRoman("XI");
        assertEquals(11, result);
    }
    
    @Test
    public void voidConvertRoman15() {
        int result = instance.convertRoman("XV");
        assertEquals(15, result);
    }
    
    @Test
    public void voidConvertRoman51() {
        int result = instance.convertRoman("LI");
        assertEquals(51, result);
    }
    
    @Test
    public void voidConvertRoman4784() {
        int result = instance.convertRoman("MMMMDCCLXXXIV");
        assertEquals(4784, result);
    }

}
