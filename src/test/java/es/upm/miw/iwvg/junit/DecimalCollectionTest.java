package es.upm.miw.iwvg.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
    private DecimalCollection dec;

    @Before
    public void before() {
        dec = new DecimalCollection();
        
        dec.add(3.0);
        dec.add(2.5);
        dec.add(1.3);
    }

    @Test
    public void testSize() {
        assertEquals(3, dec.size());    }
        
     @Test
    public void testSum() {
        assertEquals(6.8, dec.sum(),0);    }    

     @Test
     public void testHigher() {
         assertEquals(3.0, dec.higher(),0);    }        

     @Test
     public void testLower() {
         assertEquals(1.3, dec.lower(),0);    }    

}
