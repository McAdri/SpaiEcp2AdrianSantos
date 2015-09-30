package es.upm.miw.iwvg.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
    private Point pt;

    @Before
    public void before() {
        pt = new Point(2, 5);
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(2, pt.getX());
        assertEquals(5, pt.getY());
    }

    @Test
    public void testPunto() {
        pt = new Point();
        assertEquals(0, pt.getX());
        assertEquals(0, pt.getY());
    }

    @Test
    public void testModulo() {
        assertEquals(5.3851, pt.module(), 0.1);
    }

    @Test
    public void testFase() {
        assertEquals(1.19, pt.phase(), 0.01);
    }

    @Test
    public void testTranslate() {
        this.pt.translateOrigin(new Point(1, 1));
        assertEquals(1, pt.getX());
        assertEquals(4, pt.getY());
    }
    
    @Test
    public void testString() {
        assertEquals("Point[2,5]", pt.toString());
    }

}
