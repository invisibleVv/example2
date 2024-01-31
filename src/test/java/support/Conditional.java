package support;

public class Conditional {
    public static void main(String[] args) {
        int x = 0;
        int y = 10;
        int z = 3;

        if (x == 5) {
            System.out.println("x == 5");
        } else
        if (x > 1) {
            System.out.println("x > 1");
        } else {
            System.out.println("No matches");
        }
        switch (y) {
            case 3:
                System.out.println("y=3");
                break;
            case 7:
                System.out.println("y=7");
                break;
            default:
                System.out.println("No matches");
        }

        String[] arrayOfStrings = new String[5];
        arrayOfStrings[0] = "Volvo";
        arrayOfStrings[2] = "BMW";
        System.out.println(arrayOfStrings.length);

        for (int i=0;i<arrayOfStrings.length;i++) {
            System.out.println(arrayOfStrings[i]);
        }
        System.out.println("-------");
        String fullName = "Vladimir Vladimirovich Verner";
        String[] nameParts = fullName.split(" ");
        System.out.println("First name: " + nameParts[0]);

        int w = 1;
        while (w < 10) {
            System.out.println("The value of w = " + w);
            w++;
        }
    }
}
