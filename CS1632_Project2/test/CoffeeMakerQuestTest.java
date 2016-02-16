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
import static org.mockito.Mockito.*;

/**
 *
 * @author joe
 */
public class CoffeeMakerQuestTest {
    
    public CoffeeMakerQuestTest() {
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
     * Test of main method, of class CoffeeMakerQuest.
     */
    @Test
    public void testExecuteCommand_N(){
        Room mockRoom = mock(Room.class);
        Player instance = new Player();
        when(mockRoom.hasNorthDoor()).thenReturn(true);
        assertFalse(CoffeeMakerQuest.executeCommand("N", instance, mockRoom));
        
    }
    @Test
    public void testExecuteCommand_S(){
    	Player instance = new Player();
    	Room mockRoom = mock(Room.class);
    	when(mockRoom.hasSouthDoor()).thenReturn(true);
    	assertFalse(CoffeeMakerQuest.executeCommand("S", instance, mockRoom));
    }
    @Test
    public void testExecuteCommand_L(){
    	Player instance = new Player();
    	Room mockRoom = mock(Room.class);
    	when(mockRoom.hasCoffee()).thenReturn(true);
    	assertFalse(CoffeeMakerQuest.executeCommand("L", instance, mockRoom));
    }
    @Test
    public void testExecuteCommand_I(){
    	Player mockPlayer = mock(Player.class);
    	Room instance = new Room("Small", "Quaint", "sofa", "Magenta", null, false, false, false);
    	when(mockPlayer.showInventory()).thenReturn("You have a cup of delicious coffee.\n" 
    												+ "You have some fresh cream.\n" 
    												+ "You have some tasty sugar.\n" );
    	assertFalse(CoffeeMakerQuest.executeCommand("I", mockPlayer, instance));
    }
    @Test
    public void testExecuteCommand_D(){
    	Player mockPlayer = mock(Player.class);
    	Room instance = new Room("Small", "Quaint", "sofa", "Magenta", null, false, false, false);
    	when(mockPlayer.drink()).thenReturn(true);
    	assertTrue(CoffeeMakerQuest.executeCommand("D", mockPlayer, instance));
    }
    @Test
    public void testExecuteCommand_H(){
    	Player instance = new Player();
    	Room mockRoom = mock(Room.class);
    	assertFalse(CoffeeMakerQuest.executeCommand("h", instance, mockRoom));
    }
    
    @Test
    public void testInitializeGame(){
    	//Room mockRoom = mock(Room.class);
    	
    }
    @Test
    public void testGetCommand(){
    	
    }
}
