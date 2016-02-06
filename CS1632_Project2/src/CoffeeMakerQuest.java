
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
 * [ ] Player Object
 *      [ ] Inventory
 *          [ ] Coffee
 *          [ ] Cream
 *          [ ] Sugar
 *      [ ] Actions
 *          [ ] Drink (test the inventory for all objects)
 *          [ ] Show Inventory (Print out what the user has/doesn't have)
 *          [ ] Get Coffee (add coffee to player inventory)
 *          [ ] Get Cream (add cream to player inventory)
 *          [ ] Get Sugar (add sugar to player inventory)
 *          [ ] Check Coffee (does player have coffee in inventory)
 *          [ ] Check Cream (does player have cream in inventory)
 *          [ ] Check Sugar (does player have sugar in inventory)
 * 
 * ---------------------------------------------------------------------------------------------[ END SELF-CHECKS ]--
 */
public class CoffeeMakerQuest {

    public static void main(String args[]) {
        Room testroom = new Room("Small", "Quaint", "sofa", "Magenta", null, false, true, false);

        System.out.println(testroom);
    }

}
