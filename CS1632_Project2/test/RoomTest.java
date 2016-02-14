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
import static org.mockito.Mockito.mock;

/**
 *
 * @author Malsby
 */
public class RoomTest {
    
    public RoomTest() {
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
     * Test of getFurnishing method, of class Room.
     */
    @Test
    public void testGetFurnishing() {
        System.out.println("getFurnishing testing...");
        Room instance = new Room("Small", "Quaint", "sofa", "Magenta", null, false, false, false);
        String result = instance.getFurnishing();
        assertEquals("It has a Quaint sofa.\n", result);
        System.out.println("Passed!");
    }

    /**
     * Test of getRoom method, of class Room.
     */
    @Test
    public void testGetRoom() {
        System.out.println("getRoom testing...");
        Room instance = new Room("Small", "Quaint", "sofa", "Magenta", null, false, false, false);
        String expResult = "You see a Small room.\n";
        String result = instance.getRoom();
        assertEquals(expResult, result);
        System.out.println("Passed!");
    }

    /**
     * Test of hasNorthDoor method, of class Room.
     */
    @Test
    public void testHasNorthDoor() {
        System.out.println("hasNorthDoor testing...");
        Room instance = new Room("Small", "Quaint", "sofa", "Magenta", null, false, false, false);
        boolean expResult = true;
        boolean result = instance.hasNorthDoor();
        assertEquals(expResult, result);
        System.out.println("Passed!");
    }

    /**
     * Test of hasSouthDoor method, of class Room.
     */
    @Test
    public void testHasSouthDoor() {
        System.out.println("hasSouthDoor testing...");
        Room instance = new Room("Small", "Quaint", "sofa", "Magenta", null, false, false, false);
        boolean expResult = false;
        boolean result = instance.hasSouthDoor();
        assertEquals(expResult, result);
        System.out.println("Passed!");
    }

    /**
     * Test of getNorthDoor method, of class Room.
     */
    @Test
    public void testGetNorthDoor() {
        System.out.println("getNorthDoor testing...");
        Room instance = new Room("Small", "Quaint", "sofa", "Magenta", null, false, false, false);
        String expResult = "A Magenta door leads North.\n";
        String result = instance.getNorthDoor();
        assertEquals(expResult, result);
        System.out.println("Passed!");
    }

    /**
     * Test of getSouthDoor method, of class Room.
     */
    @Test
    public void testGetSouthDoor() {
        System.out.println("getSouthDoor testing...");
        Room instance = new Room("Small", "Quaint", "sofa", "Magenta", null, false, false, false);
        String expResult = "";
        String result = instance.getSouthDoor();
        assertEquals(expResult, result);
        System.out.println("Passed!");
    }

    /**
     * Test of getDescription method, of class Room.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription testing...");
        Room instance = new Room("Small", "Quaint", "sofa", "Magenta", null, false, false, false);
        String expResult = "\n" +
                            "You see a Small room.\n" +
                            "It has a Quaint sofa.\n" +
                            "A Magenta door leads North.\n" +
                            "\n";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        System.out.println("Passed!");
    }

    /**
     * Test of toString method, of class Room.
     */
    @Test
    public void testToString() {
        System.out.println("toString testing...");
        Room instance = new Room("Small", "Quaint", "sofa", "Magenta", null, false, false, false);
        String expResult = "\n" +
                            "You see a Small room.\n" +
                            "It has a Quaint sofa.\n" +
                            "A Magenta door leads North.\n" +
                            "\n";
        String result = instance.toString();
        assertEquals(expResult, result);
        System.out.println("Passed!");
    }
    
}
