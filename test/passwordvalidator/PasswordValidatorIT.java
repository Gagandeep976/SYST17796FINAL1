/*
 * Gagandeep Singh
 * Student ID: 991616664
 * SYST10199 - Web Programming
 */
package passwordvalidator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SAMSUNG
 */
public class PasswordValidatorIT {
    
    public PasswordValidatorIT() {
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

    /**
     * Test of main method, of class PasswordValidator.
     */
    @Test
     public void testCalculateNet() {
        int hours=20;
        int rate=34;
        int tax=16;
        int result= PasswordValidator.calculateNet(hours,rate,tax);
        assertEquals(668, result);
    }
    
}
