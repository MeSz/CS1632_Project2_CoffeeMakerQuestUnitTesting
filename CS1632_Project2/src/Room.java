
/**
 *  [X] ONE Unique adjective describing the room
 *  [X] ONE Unique Furnishing in the room
 *  [X] ONE Unique adjective describing the Furnishing in the room
 *  [X] ZERO or ONE coffee-related items in the room
 *  [X] ZERO or ONE doors leading North
 *  [X] ZERO or ONE doors leading South
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

    /**
     * Creates a new game room, given the following values:
     * <ul>
     * <li>A (unique) adjective describing the room.</li>
     * <li>A (unique) adjective describing the furnishing in the room.</li>
     * <li>A (unique) furnishing in the room.</li>
     * <li>A (unique) adjective describing the door leading North (if a door exists).</li>
     * <li>A (unique) adjective describing the door leading South (if a door exists).</li>
     * <li>A true/false value indicating whether the 'Coffee' item exists in this room.</li>
     * <li>A true/false value indicating whether the 'Cream' item exists in this room.</li>
     * <li>A true/false value indicating whether the 'Sugar' item exists in this room.</li>
     * </ul>
     *
     * @param room_adjective The (unique) adjective describing this room.
     * @param furnishing_adjective The (unique) adjective describing the furnishing in this room.
     * @param furnishing The (unique) furnishing in this room.
     * @param door_north_adjective The (unique) adjective describing the door leading North (<i>null</i> if no door
     * exists).
     * @param door_south_adjective The (unique) adjective describing the door leading South (<i>null</i> if no door
     * exists).
     * @param hasCoffee True if this room contains the 'Coffee' item; otherwise false.
     * @param hasCream True if this room contains the 'Cream' item; otherwise false.
     * @param hasSugar True if this room contains the 'Sugar' item; otherwise false.
     */
    public Room(String room_adjective, String furnishing_adjective, String furnishing,
            String door_north_adjective, String door_south_adjective,
            boolean hasCoffee, boolean hasCream, boolean hasSugar) {

        if (room_adjective == null) {
            throw new IllegalArgumentException("The room must contain a (unique) adjective describing it.");
        } else {
            this.adjRoom = room_adjective;
        }

        if (furnishing == null) {
            throw new IllegalArgumentException("The room must contain a (unique) furnishing.");
        } else {
            this.furnishing = furnishing;
        }

        if (furnishing_adjective == null) {
            throw new IllegalArgumentException("The room must contain a (unique) adjective describing the furnishing.");
        } else {
            this.adjFurnishing = furnishing_adjective;
        }

        if ((door_north_adjective == null) && (door_south_adjective == null)) {
            throw new IllegalArgumentException("This room must have at least one door leading North or one door leading South.");
        } else {
            this.adjNorthDoor = door_north_adjective;
            this.adjSouthDoor = door_south_adjective;
        }

        /**
         * Want to only allow two valid scenarios for the coffee-related items:
         *  1) The Coffee, Cream, and Sugar items do NOT exist in the room.
         *  2) ONLY ONE Coffee, Sugar, OR Cream item exists in the room.
         */
        if ( ((hasCoffee==false) && (hasCream==false) && (hasSugar==false)) ||
             ((hasCoffee ^ hasCream ^ hasSugar) ^ (hasCoffee && hasCream && hasSugar))
           ) {
            this.hasCoffee = hasCoffee;
            this.hasCream = hasCream;
            this.hasSugar = hasSugar;
        } else {
            throw new IllegalArgumentException("This room can contain either NO coffee-related items, "
                    + "or only ONE coffee-related item.");
        }
    }
    
    /**
     * Sees if this room has the Coffee item.
     * 
     * @return True if the room has the Coffee item; otherwise false.
     */
    public boolean hasCoffee() {
        return this.hasCoffee;
    }
    
    /**
     * Sees if this room has the Cream item.
     * 
     * @return True if the room has the Cream item; otherwise false.
     */
    public boolean hasCream() {
        return this.hasCream;
    }
    
    /**
     * Sees if this room has the Sugar item.
     * 
     * @return True if the room has the Sugar item; otherwise false.
     */
    public boolean hasSugar() {
        return this.hasSugar;
    }

    /**
     * Gets the description of the furnishing in this room.
     *
     * @return A description of the unique furnishing in this room.
     */
    public String getFurnishing() {
        return String.format("It has a %s %s.\n", this.adjFurnishing, this.furnishing);
    }

    /**
     * Gets the description of the current room.
     *
     * @return A description of the unique furnishing in this room.
     */
    public String getRoom() {
        return String.format("You see a %s room.\n", this.adjRoom);
    }

    /**
     * Gets a value indicating whether or not this room contains a door leading North.
     *
     * @return True if a door exists leading North; otherwise false.
     */
    public boolean hasNorthDoor() {
        return (this.adjNorthDoor != null);
    }

    /**
     * Gets a value indicating whether or not this room contains a door leading South.
     *
     * @return True if a door exists leading South; otherwise false.
     */
    public boolean hasSouthDoor() {
        return (this.adjSouthDoor != null);
    }

    /**
     * Gets the description of the North door in this room (if one exists).
     *
     * @return A description of the (unique) door leading North.
     */
    public String getNorthDoor() {
        if (this.hasNorthDoor()) {
            return String.format("A %s door leads North.\n", this.adjNorthDoor);
        }

        return ""; // no North door exists
    }

    /**
     * Gets the description of the North door in this room (if one exists).
     *
     * @return A description of the (unique) door leading North.
     */
    public String getSouthDoor() {
        if (this.hasSouthDoor()) {
            return String.format("A %s door leads South.\n", this.adjSouthDoor);
        }

        return ""; // no South door exists
    }

    /**
     * Gets a description of the entire room including the type of room, furnishing, and doors leading North or South
     * (if either one exists).
     *
     * @return A description of the entire room.
     */
    public String getDescription() {
        return "\n" + getRoom() + getFurnishing() + getNorthDoor() + getSouthDoor();
    }

    /**
     * Gets a description of the entire room including the type of room, furnishing, and doors leading North or South
     * (if either one exists).
     *
     * @return A description of the entire room.
     */
    @Override
    public String toString() {
        return this.getDescription();
    }
}
