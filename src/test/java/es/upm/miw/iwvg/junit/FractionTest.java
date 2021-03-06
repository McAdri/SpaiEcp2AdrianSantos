package es.upm.miw.iwvg.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
   
   @Test
   public void testPropia() {
       assertFalse(fr.isPropia());
       assertTrue(new Fraction(1,2).isPropia());
   }
   
   @Test
   public void testIsMinor() {
       assertTrue(fr.isMinor(new Fraction(1,2)));
   }
   @Test
   public void testIsEquivalente() {
       assertTrue(fr.isEquivalente(new Fraction(4,2)));
   }
    
}
