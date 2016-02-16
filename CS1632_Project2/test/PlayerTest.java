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
    public void testShowInventoryNone() {
        System.out.println("showInventory with no items testing...");
        Player instance = new Player();
        String expResult = "\nYOU HAVE NO COFFEE!\n" +
                            "YOU HAVE NO CREAM!\n" +
                            "YOU HAVE NO SUGAR!\n\n";
        String result = instance.showInventory();
        assertEquals(expResult, result);
        System.out.println("Passed!");
    }
    @Test
    public void testShowInventoryCoffeeCreamSugar() {
        System.out.println("showInventory with coffee, cream & sugar testing...");
        Player instance = new Player();
        instance.getCoffee();
        instance.getCream();
        instance.getSugar();
        String expResult = "\nYou have a cup of delicious coffee.\n" +
                            "You have some fresh cream.\n" +
                            "You have some tasty sugar.\n\n";
        String result = instance.showInventory();
        assertEquals(expResult, result);
        System.out.println("Passed!");
    }
    

    /**
     * Test of hasCoffee method, of class Player.
     */
    @Test
    public void testHasCoffee() {
        System.out.println("hasCoffee testing...");
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.hasCoffee();
        assertEquals(expResult, result);
        System.out.println("Passed!");
    }

    /**
     * Test of hasCream method, of class Player.
     */
    @Test
    public void testHasCream() {
        System.out.println("hasCream testing...");
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.hasCream();
        assertEquals(expResult, result);
        System.out.println("Passed!");
    }

    /**
     * Test of hasSugar method, of class Player.
     */
    @Test
    public void testHasSugar() {
        System.out.println("hasSugar testing...");
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.hasSugar();
        assertEquals(expResult, result);
        System.out.println("Passed!");
    }

    /**
     * Test of getCoffee method, of class Player.
     */
    @Test
    public void testGetCoffee() {
        System.out.println("getCoffee testing...");
        Player instance = new Player();
        instance.getCoffee();
        assertTrue(instance.hasCoffee());
        System.out.println("Passed!");
    }

    /**
     * Test of getCream method, of class Player.
     */
    @Test
    public void testGetCream() {
        System.out.println("getCream testing...");
        Player instance = new Player();
        instance.getCream();
        assertTrue(instance.hasCream());
        System.out.println("Passed!");
    }

    /**
     * Test of getSugar method, of class Player.
     */
    @Test
    public void testGetSugar() {
        System.out.println("getSugar testing...");
        Player instance = new Player();
        instance.getSugar();
        assertTrue(instance.hasSugar());
        System.out.println("Passed!");
    }
    
}
