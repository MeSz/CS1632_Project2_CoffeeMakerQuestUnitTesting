/**
 * [X] Description
 *      [X] ONE (1) Unique Adjective describing the room
 *      [X] ONE (1) Unique Furnishing in the room
 *      [ ] ONE (1) unique item in the room
 */
public class Room {
    private String _adjective = null;
    private String _furnishing = null;
    private String _item = null;
    
    public Room(String adjective, String furnishing, String item) {
        this._adjective = adjective;
        this._furnishing = furnishing;
        this._item = item;
    }
}
