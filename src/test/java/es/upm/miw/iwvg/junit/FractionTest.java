package es.upm.miw.iwvg.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction fr;

    @Before
    public void before() {
        fr = new Fraction(4, 2);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(4, fr.getNumerator());
        assertEquals(2, fr.getDenominator());
            }


    @Test
    public void testDecimal() {
        assertEquals(2.0, fr.decimal(), 10e-5);
    }

   @Test
    public void testResto() {
        assertEquals(0.0, fr.getNumerator() % fr.getDenominator(), 10e-5);
    }

    
}
