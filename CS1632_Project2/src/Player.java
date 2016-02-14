/**
 * [X] Inventory
 *     [X] Coffee
 *     [X] Cream
 *     [X] Sugar
 * [X] Actions
 *     [X] Drink (test the inventory for all objects)
 *     [X] Show Inventory (Print out what the user has/doesn't have)
 *     [X] Get Coffee (add coffee to player inventory)
 *     [X] Get Cream (add cream to player inventory)
 *     [X] Get Sugar (add sugar to player inventory)
 *     [X] Check Coffee (does player have coffee in inventory?)
 *     [X] Check Cream (does player have cream in inventory?)
 *     [X] Check Sugar (does player have sugar in inventory?)
 */
public class Player {
    private boolean hasCoffee = false;
    private boolean hasCream = false;
    private boolean hasSugar = false;
    
    public Player() {}
    
    /**
     * "Drinks" the ingredients that the player has.
     * 
     * @return True if the player has the Coffee, Cream, and Sugar items; otherwise False.
     */
    public boolean drink() {
        return (this.hasCoffee && this.hasCream && this.hasSugar);
    }
    
    /**
     * Displays the current player's coffee status (i.e. Do they have Coffee/Cream/Sugar?).
     * 
     * @return A message indicating which coffee items the player has collected.
     */
    public String showInventory() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n");
        
        if (this.hasCoffee) {
            sb.append("You have a cup of delicious coffee.\n");
        } else {
            sb.append("YOU HAVE NO COFFEE!\n");
        }
        
        if (this.hasCream) {
            sb.append("You have some fresh cream.\n");
        } else {
            sb.append("YOU HAVE NO CREAM!\n");
        }
        
        if (this.hasSugar) {
            sb.append("You have some tasty sugar.\n");
        } else {
            sb.append("YOU HAVE NO SUGAR!\n");
        }
        
        sb.append("\n");
        
        return sb.toString();
    }
    
    /**
     * Checks if the player has the coffee item.
     * 
     * @return True if the player has the coffee item; otherwise False.
     */
    public boolean hasCoffee() {
        return this.hasCoffee;
    }
    
    /**
     * Checks if the player has the cream item.
     * 
     * @return True if the player has the cream item; otherwise False.
     */
    public boolean hasCream() {
        return this.hasCream;
    }
    
    /**
     * Checks if the player has the sugar item.
     * 
     * @return True if the player has the sugar item; otherwise False.
     */
    public boolean hasSugar() {
        return this.hasSugar;
    }
    
    /**
     * Gives the player the coffee item.
     */
    public void getCoffee() {
        this.hasCoffee = true;
    }
    
    /**
     * Gives the player the cream item.
     */
    public void getCream() {
        this.hasCream = true;
    }
    
    /**
     * Gives the player the sugar item.
     */
    public void getSugar() {
        this.hasSugar = true;
    }
}
