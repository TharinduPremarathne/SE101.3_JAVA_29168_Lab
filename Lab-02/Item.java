public class Item {
    protected int location;
    protected String description;

    public Item(int location, String description) {
        this.location = location;
        this.description = description;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

// Monster class (sub-class of Item)
class Monster extends Item {
    public Monster(int location, String description) {
        super(location, description); 
    }
}