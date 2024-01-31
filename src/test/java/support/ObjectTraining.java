package support;

public class ObjectTraining {
    public static void main(String[] args) {
        House house = new House();
        house.color = "red";
        house.numberOfStories = 2;
        house.numberOfWidows = 8;

        System.out.println(house.color);

        House house2 = new House("blue", 5, 2);
        System.out.println(house.numberOfStories);

        System.out.println(House.basement);

        house.openTheDoor();
    }
}
