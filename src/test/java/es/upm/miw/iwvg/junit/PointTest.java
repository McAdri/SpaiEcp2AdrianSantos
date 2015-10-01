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
    
    @Test
    public void testPuntoMedio() {
    	Point point1 = new Point(20,20);
    	Point point2 = new Point(10,10);
    	
    	Point medio = point1.puntoMedio(point2);
    	
        assertEquals(medio.getX(), 15, 0.0);
        assertEquals(medio.getY(), 15, 0.0);
    }
    
    @Test
    public void testSetX() {
    	Point point1 = new Point(1,1);
    	
    	point1.setX(2);
    	
        assertEquals(point1.getX(), 2, 0.0);
    }
    
    @Test
    public void testSetY() {
    	Point point1 = new Point(1,1);
    	
    	point1.setY(2);
    	
        assertEquals(point1.getY(), 2, 0.0);
    }

}
