/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joe
 */
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of drink method, of class Player.
     */
    @Test
    public void testDrink() {
        System.out.println("drink testing...");
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.drink();
        assertEquals(expResult, result);
    }

    /**
     * Test of showInventory method, of class Player.
     */
    @Test
    public void testShowInventory() {
        System.out.println("showInventory");
        Player instance = new Player();
        String expResult = "";
        String result = instance.showInventory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasCoffee method, of class Player.
     */
    @Test
    public void testHasCoffee() {
        System.out.println("hasCoffee");
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.hasCoffee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasCream method, of class Player.
     */
    @Test
    public void testHasCream() {
        System.out.println("hasCream");
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.hasCream();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasSugar method, of class Player.
     */
    @Test
    public void testHasSugar() {
        System.out.println("hasSugar");
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.hasSugar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoffee method, of class Player.
     */
    @Test
    public void testGetCoffee() {
        System.out.println("getCoffee");
        Player instance = new Player();
        instance.getCoffee();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCream method, of class Player.
     */
    @Test
    public void testGetCream() {
        System.out.println("getCream");
        Player instance = new Player();
        instance.getCream();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSugar method, of class Player.
     */
    @Test
    public void testGetSugar() {
        System.out.println("getSugar");
        Player instance = new Player();
        instance.getSugar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
