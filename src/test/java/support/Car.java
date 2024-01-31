package support;

public class Car {
    public int fuelLevel = 100;
    public int distance = 0;

    public void drive(int distance) {
        //check if we can go that for
        if (this.fuelLevel - distance <=0) {
            System.out.println("We can't drive so far...");
            return;
        }

        fuelLevel = fuelLevel - distance;
        distance = this.distance + distance;
        System.out.println("Driven: " + distance + "fuel: " + this.fuelLevel);
    }

    public void fuelUp() {
        this.fuelLevel = 100;
    }
}
