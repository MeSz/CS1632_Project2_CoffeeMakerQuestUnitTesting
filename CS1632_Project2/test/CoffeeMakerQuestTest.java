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
    public void testExecuteCommand_S(){
    	Player mockPlayer = mock(Player.class);
    	
    }
    
    @Test
    public void testInitializeGame(){
    	//Room mockRoom = mock(Room.class);
    	
    }
    @Test
    public void testGetCommand(){
    	
    }
}
