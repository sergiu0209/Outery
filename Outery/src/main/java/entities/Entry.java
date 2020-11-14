package entities;

import java.sql.Time;
import java.util.HashMap;

public class Entry {
    // Basic entry data
    private String entryType;
    private UserView owner;
    private UserView creator;
    private String textData;
    private Time postTime;
    // Interaction related data
    private HashMap<Object,Entry> comments;
    private HashMap<Enum,Entry> reactions;
}
