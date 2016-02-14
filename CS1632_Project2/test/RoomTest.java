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
        System.out.println("getFurnishing");
        Room instance = new Room("Small", "Quaint", "sofa", "Magenta", null, false, false, false);
        String result = instance.getFurnishing();
        assertEquals("It has a Quaint sofa.\n", result);
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
    }

    /**
     * Test of hasSouthDoor method, of class Room.
     */
    @Test
    public void testHasSouthDoor() {
        System.out.println("hasSouthDoor");
        Room instance = new Room("Small", "Quaint", "sofa", "Magenta", null, false, false, false);
        boolean expResult = false;
        boolean result = instance.hasSouthDoor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNorthDoor method, of class Room.
     */
    @Test
    public void testGetNorthDoor() {
        System.out.println("getNorthDoor");
        Room instance = new Room("Small", "Quaint", "sofa", "Magenta", null, false, false, false);
        String expResult = "Magenta";
        String result = instance.getNorthDoor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSouthDoor method, of class Room.
     */
    @Test
    public void testGetSouthDoor() {
        System.out.println("getSouthDoor");
        Room instance = new Room("Small", "Quaint", "sofa", "Magenta", null, false, false, false);
        String expResult = "";
        String result = instance.getSouthDoor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Room.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Room instance = new Room("Small", "Quaint", "sofa", "Magenta", null, false, false, false);
        String expResult = "\nYou see a Small room.\n" +
                            "It has a Quaint sofa.\n" +
                            "A Magenta door leads North.\n";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Room.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Room instance = new Room("Small", "Quaint", "sofa", "Magenta", null, false, false, false);
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
