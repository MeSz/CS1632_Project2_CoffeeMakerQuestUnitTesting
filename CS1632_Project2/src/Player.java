/**
 * [ ] Inventory
 *     [ ] Coffee
 *     [ ] Cream
 *     [ ] Sugar
 * [ ] Actions
 *     [ ] Drink (test the inventory for all objects)
 *     [ ] Show Inventory (Print out what the user has/doesn't have)
 *     [ ] Get Coffee (add coffee to player inventory)
 *     [ ] Get Cream (add cream to player inventory)
 *     [ ] Get Sugar (add sugar to player inventory)
 *     [ ] Check Coffee (does player have coffee in inventory?)
 *     [ ] Check Cream (does player have cream in inventory?)
 *     [ ] Check Sugar (does player have sugar in inventory?)
 */
public class Player {
    private boolean hasCoffee = false;
    private boolean hasCream = false;
    private boolean hasSugar = false;
    
    public Player() {
        
    }
    
    public boolean drink() {
        return (this.hasCoffee && this.hasCream && this.hasSugar);
    }
    
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
    
    public boolean hasCoffee() {
        return this.hasCoffee;
    }
    
    public boolean hasCream() {
        return this.hasCream;
    }
    
    public boolean hasSugar() {
        return this.hasSugar;
    }
    
    public void getCoffee() {
        this.hasCoffee = true;
    }
    
    public void getCream() {
        this.hasCream = true;
    }
    
    public void getSugar() {
        this.hasSugar = true;
    }
}
