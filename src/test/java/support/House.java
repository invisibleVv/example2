package support;

public class House {
    public int numberOfWidows;
    public int numberOfStories;
    public String color;

    public static String basement = "We do have a basement";

    public House() {

    }


    public House (String color, int numberOfWidows, int numberOfStories) {
        this.color = color;
        this.numberOfWidows = numberOfWidows;
        this.numberOfStories = numberOfStories;
    }

    public void openTheDoor() {
        System.out.println("The front door opens...");
    }
}
