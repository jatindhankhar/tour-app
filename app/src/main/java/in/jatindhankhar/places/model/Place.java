package in.jatindhankhar.places.model;

/**
 * Created by jatin on 1/15/18.
 */

public class Place {
    private String name;
    private String location;
    private int imageResource;

    public Place() {

    }

    public Place(String name, String location, int imageResource) {
        this.name = name;
        this.location = location;
        this.imageResource = imageResource;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
