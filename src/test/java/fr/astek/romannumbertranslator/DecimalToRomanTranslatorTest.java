package fr.astek.romannumbertranslator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DecimalToRomanTranslatorTest {

    private DecimalToRomanTranslator instance;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new DecimalToRomanTranslator();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of convertDecimal method, of class DecimalToRomanTranslator.
     */
    @Test
    public void testConvertDecimal0() {
        String roman = instance.convertDecimal(0);

        assertEquals("", roman);
    }

    @Test
    public void testConvertDecimal1() {
        String roman = instance.convertDecimal(1);

        assertEquals("I", roman);
    }

    @Test
    public void testConvertDecimal2() {
        String roman = instance.convertDecimal(2);

        assertEquals("II", roman);
    }

    @Test
    public void testConvertDecimal3() {
        String roman = instance.convertDecimal(3);

        assertEquals("III", roman);
    }

    @Test
    public void testConvertDecimal5() {
        String roman = instance.convertDecimal(5);
        assertEquals("V", roman);
    }

    @Test
    public void testConvertDecimal6() {
        String roman = instance.convertDecimal(6);
        assertEquals("VI", roman);
    }

    @Test
    public void testConvertDecimal10() {
        String roman = instance.convertDecimal(10);
        assertEquals("X", roman);
    }

    @Test
    public void testConvertDecimal11() {
        String roman = instance.convertDecimal(11);
        assertEquals("XI", roman);
    }

    @Test
    public void testConvertDecimal18() {
        String roman = instance.convertDecimal(18);
        assertEquals("XVIII", roman);
    }

    @Test
    public void testConvertDecimal20() {
        String roman = instance.convertDecimal(20);
        assertEquals("XX", roman);
    }
}
