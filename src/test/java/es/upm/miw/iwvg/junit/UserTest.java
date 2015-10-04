package es.upm.miw.iwvg.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User user;

    @Before
    public void before() {
        user = new User(14, "Fernando", "Alonso");
    }

    @Test
    public void fullName() {
        assertEquals("Fernando Alonso", user.fullName());
    }

    @Test
    public void initialsName() {
        assertEquals("F.", user.initials());
    }
    
    @Test
    public void testNumber() {
        assertEquals(14, user.getNumber());
    }
    
    @Test
    public void testName() {
        assertEquals("Fernando", user.getName());
    }
    
     @Test
    public void testFamilyName() {
        assertEquals("Alonso", user.getFamilyName());
    }
     
     @Test
     public void testfullNameCapitals() {
         assertEquals("FERNANDO ALONSO", user.fullNameCapitals());
     }
}
