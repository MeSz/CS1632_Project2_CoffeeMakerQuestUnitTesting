/**
 * [X] Description
 *      [X] ONE (1) Unique Adjective describing the room
 *      [X] ONE (1) Unique Furnishing in the room
 *      [ ] ONE (1) unique item in the room
 */
public class Room {
    private String furnishing = null;       // furnishing in the room
    private String adjFurnishing = null;    // adjective for the furnishing in the room
    private String adjRoom = null;          // adjective for the room
    private String adjNorthDoor = null;     // adjective for the north door in the room
    private String adjSouthDoor = null;     // adjective for the south door in the room
    
    private boolean hasCoffee = false;
    private boolean hasCream = false;
    private boolean hasSugar = false;
    
    public Room(String room_adjective, String furnishing_adjective, 
                String furnishing, String door_north_adjective, String door_south_adjective,
                boolean hasCoffee, boolean hasCream, boolean hasSugar) {
        
        this.adjRoom = room_adjective;
        this.furnishing = furnishing;
        this.adjFurnishing = furnishing_adjective;
        this.adjNorthDoor = door_north_adjective;
        this.adjSouthDoor = door_south_adjective;
        
        this.hasCoffee = hasCoffee;
        this.hasCream = hasCream;
        this.hasSugar = hasSugar;
    }
    
    public String getFurnishing() {
        return String.format("%1%s %2%s\n", this.adjFurnishing, this.furnishing);
    }
    
    public String getRoom() {
        return String.format("You see a %1%s room.\n", this.adjRoom);
    }
    
    public String getNorthDoor() {
        if (this.adjNorthDoor != null) {
            return String.format("A %1%s door leads North.\n", this.adjNorthDoor);
        }
        
        return "";
    }
    
    public String getSouthDoor() {
        if (this.adjSouthDoor != null) {
            return String.format("A %1%s door leads South.\n", this.adjSouthDoor);
        }
        
        return "";
    }
    
    public String getDescription() {
        return getRoom() + getFurnishing() + getNorthDoor() + getSouthDoor();
    }
}
