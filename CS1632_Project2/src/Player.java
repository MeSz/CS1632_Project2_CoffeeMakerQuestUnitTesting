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
 *     [ ] Check Coffee (does player have coffee in inventory)
 *     [ ] Check Cream (does player have cream in inventory)
 *     [ ] Check Sugar (does player have sugar in inventory)
 */
public class Player {
    private boolean _hasCoffee = false;
    private boolean _hasCream = false;
    private boolean _hasSugar = false;
    
    public Player() {
        
    }
    
    public boolean drink() {
        return (_hasCoffee && _hasCream && _hasSugar);
    }
    
    public static void showInventory() {
        
    }
    
    public boolean hasCoffee() {
        return _hasCoffee;
    }
    
    public boolean hasCream() {
        return _hasCream;
    }
    
    public boolean hasSugar() {
        return _hasSugar;
    }
    
    public void getCoffee() {
        _hasCoffee = true;
    }
    
    public void getCream() {
        _hasCream = true;
    }
    
    public void getSugar() {
        _hasSugar = true;
    }
}
