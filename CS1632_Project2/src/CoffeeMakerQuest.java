
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.xml.bind.annotation.XmlElement;


/**
 * CS1632 Project 2: Unit Testing (Coffee Maker Quest)
 * 
 * @author Joe Meszar (jwm54@pitt.edu) | David Sweeney (dms163@pitt.edu)
 *
 *
 * --[ REQUIREMENTS ]------------------------------------------------------------------------------------------------
 *
 *	[ ] FUN-ITERATION - At each iteration of the game, the user shall be able enter one of six commands -
 *          "N" to go North, "S" to go South, "L" to Look for items, "I" for Inventory,
 *          "H" for Help, or "D" to Drink.
 *
 *	[ ] FUN-UNKNOWN-COMMAND - If a player enters a command not specified by FUN-ITERATION, the system shall
 *          respond with the phrase "What?".
 *
 *	[ ] FUN-INPUT-CAPS - The system shall be case-insensitive in regards to input values; that is, it shall
 *          accept capital and lower-case letters and treat them as equivalent.
 *
 *	[ ] FUN-MOVE - The system shall allow a player to move North only if a door exists going North, and
 *          South only if a door exists going South.
 *
 *	[ ] FUN-WIN - The player shall win the game if and only if Coffee, Sugar, and Cream have been collected
 *          by the player and then drunk.
 *
 *	[ ] FUN-LOSE - The player shall lose the game if and only if the player Drinks but has not collected all
 *          of the items (Coffee, Sugar, and Cream).
 *
 *	[ ] FUN-INVENTORY - Upon entering "I" for inventory, the player shall be informed of the items that
 *          he/she has collected (consisting of Coffee, Sugar, and Cream).
 *
 *	[ ] FUN-LOOK - Upon entering "L" for Look, the player shall collect any items in the room and those items
 *          will be added to the player's inventory.
 *
 *	[ ] FUN-HELP - Upon entering "H" for Help, the player shall be shown a listing of possible commands and
 *          what their effects are.
 *
 *	[ ] FUN-UNIQ-ROOM - Each room in the house shall have a unique adjective describing it.
 *
 *	[ ] FUN-UNIQ-ROOM-FURNISHING - Each room in the house shall have one and only one unique furnishing
 *          visible to the user upon entering the room.
 * 
 * --------------------------------------------------------------------------------------------[ END REQUIREMENTS ]--
 *
 * 
 * --[ SELF-CHECKS ]-------------------------------------------------------------------------------------------------
 * 
 * [ ] Game Object
 *      [ ] ONE player object variable
 *      [ ] An array variable of Room objects
 *      [ ] A unique array of "adjectives"
 *      [ ] A unique array of "furnishings"
 *      [ ] An array of "coffee-items". (Coffee, Cream, Sugar)
 *      [ ] Current room number variable (int)
 *      [ ] Input handler
 *          [ ] Case-Insensitive handler for input
 *          [ ] "L" (Look inside of room) Calls the Look method:
 *              [ ] Grabs the current item from room (if coffee/cream/sugar only)
 *              [ ] Outputs the room description again
 *          [ ] "I" Calls the player's "show inventory" method
 *              [ ] Outputs what the player currently has (coffee/cream/sugar only)
 *              [ ] Outputs the room description again
 *          [ ] "H" Calls the Help method
 *              [ ] Outputs the help screen
 *          [ ] "N" go 'North' to next room. (current room + 1)
 *              [ ] Only allow this if there exists a "next" room
 *          [ ] "S" go 'South' to previous room. (current room - 1)
 *              [ ] Only allow this if there exists a "previous" room
 *      [ ] Methods
 *          [ ] A way to pick a unique adjective from an array so that it is
 *              never picked again after that.
 *          [ ] A way to pick a unique furnishing from an array so that it is never picked again.
 *
 * [/] Room Object
 *      [X] ONE (1) Unique Adjective describing the room
 *          [ ] (this should just be picked from an "adjectives" array)
 *      [X] ONE (1) Unique Furnishing in the room
 *          [ ] (this should just be picked from a "furnishings" array)
 *      [X] ZERO (0) or ONE (1) Unique coffee-related item in the room
 *          [ ] (this should just be picked from a "coffee-items" array)
 *
 * [X] Player Object
 *      [X] Inventory
 *          [X] Coffee
 *          [X] Cream
 *          [X] Sugar
 *      [X] Actions
 *          [X] Drink (test the inventory for all objects)
 *          [X] Show Inventory (Print out what the user has/doesn't have)
 *          [X] Get Coffee (add coffee to player inventory)
 *          [X] Get Cream (add cream to player inventory)
 *          [X] Get Sugar (add sugar to player inventory)
 *          [X] Check Coffee (does player have coffee in inventory?)
 *          [X] Check Cream (does player have cream in inventory?)
 *          [X] Check Sugar (does player have sugar in inventory?)
 * 
 * ---------------------------------------------------------------------------------------------[ END SELF-CHECKS ]--
 */
public class CoffeeMakerQuest {
    private static final String[] adjRooms = {"Small", "Funny", "Refinanced", "Dumb", "Bloodthirsty", "Rough"};
    private static final String[] adjFurniture = {"Quaint", "Sad", "Tight", "Flat", "Beautiful", "Perfect"};
    private static final String[] furnitures = {"sofa", "record player", "Pizza", "energy drink", "bag of money", "air hockey table"};
    private static final String[] adjNorthDoors = {"Magenta", "Beige", "Dead", "Vivacious", "Purple", null};
    private static final String[] adjSouthDoors = {null, "Massive", "Smart", "Slim", "Sandy", "Minimalist"};

    public static void main(String args[]) throws IOException {
        // build all of the rooms from the rooms array
        Room[] rooms = new Room[adjRooms.length];
        int num = 0;
        for (String adjRoom : adjRooms) {
            rooms[num] = new Room(adjRoom, adjFurniture[num], furnitures[num], 
                    adjNorthDoors[num], adjSouthDoors[num], true, false, false);
            num++;
        }
        
        // create a reader to get the user's input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        
        // create a player object
        Player player = new Player();
        
        // loop until the the player drinks
        boolean done = false;
        num = 0;
        while (!done) {
            
            // show the contents of the room and user instructions
            System.out.println(rooms[num]);
            System.out.println(" INSTRUCTIONS (N,S,L,I,D) >");
            
            // get user input (uppercase)
            input = br.readLine().toUpperCase();
            
            switch (input) {
                case "N": // go thru the North door (if exists)
                    if (rooms[num].hasNorthDoor()) {
                        num++;
                    } else {
                        System.out.println("No North door exists!");
                    }                   
                    break;
                    
                case "S": // go thru the South door (if exists)
                    if (rooms[num].hasSouthDoor()) {
                        num--;
                    } else {
                        System.out.println("No South door exists!");
                    }
                    break;
                    
                case "L": // look in the current room for coffee/cream/sugar
                    if (rooms[num].hasCoffee()) {                        
                        // add the Coffee item to the player's inventory
                        player.getCoffee();
                        System.out.println("There might be something here...\nYou found some caffeinated coffee!");
                        
                    } else if (rooms[num].hasCream()) {                        
                        // add the Cream item to the player's inventory
                        player.getCream();
                        System.out.println("There might be something here...\nYou found some creamy cream!");
                        
                    } else if (rooms[num].hasSugar()) {                        
                        // add the Sugar item to the player's inventory
                        player.getSugar();
                        System.out.println("There might be something here...\nYou found some sweet sugar!");
                        
                    } else {
                        System.out.println("You don't see anything out of the ordinary.");
                    }
                    break;
                    
                case "I": // show the current user's coffee-item inventory
                    System.out.println(player.showInventory());
                    break;
                    
                case "D": // perform the drink operation on the current player
                    // show the player's inventory
                    System.out.println(player.showInventory());
                    
                    if (player.drink()) {
                        // SUCCESS!
                        System.out.println("You drink the beverage and are ready to study!\nYou win!");
                        
                    } else if (player.hasCoffee() && player.hasCream()) {
                        System.out.println("Without sugar, the coffee is too bitter.  You cannot study.\nYou lose!");
                        
                    } else if ((player.hasCoffee() && player.hasSugar()) || (player.hasCoffee())) {
                        System.out.println("Without cream, you get an ulcer and cannot study.\nYou lose!");
                        
                    } else if (player.hasSugar() && player.hasCream()) {
                        System.out.println("You drink the sweetened cream, but without caffeine, you cannot study.\nYou lose!");
                        
                    } else if (player.hasSugar()) {
                        System.out.println("You eat the sugar, but without caffeine, you cannot study.\nYou lose!");
                        
                    } else if (player.hasCream()) {
                        System.out.println("You drink the cream, but without caffeine, you cannot study.\nYou lose!");
                        
                    } else {
                        System.out.println("You drink the air, as you have no coffee, sugar, or cream.\n" +
                                    "The air is invigorating, but not invigorating enough.  You cannot study.\n" +
                                    "You lose!");
                    }
                    
                    // in any case, the game is over.
                    done = true;
                    
                    break;
                    
                default: // invalid input
                    System.out.println("What?");
            }   
        }
    }

}
