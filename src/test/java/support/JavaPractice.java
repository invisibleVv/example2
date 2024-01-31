package support;

import java.util.ArrayList;
import java.util.List;

public class JavaPractice {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();
        stringList.add("New list member");
        stringList.add("Another list member");
        stringList.add("Portnov");

        for (var item: stringList) {
            System.out.println(item);
        }

        String[] strArray = {"1", "2", "3", "4"};

        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
//        int x = 45;
//        int y = 10;
//
//        int result = x + y;
//        System.out.println("The result: " + calculate(14, 3, "*"));
//
//        Scanner scan = new Scanner(System.in);
////        System.out.println("Provide first operand: ");
//        int operand1 = scan.nextInt();
//
////        System.out.println("Provide second operand: ");
//        int operand2 = scan.nextInt();
//
////        System.out.println("provide operation (+, -, /, *): ");
//        String operation = scan.next();
//
//        System.out.println(calculate(operand1, operand2, operation));

//        if (10 != 10) {
//            System.out.println("Statement is true");
//        } else {
//            System.out.println("Statement is false");
//        }
//
//        boolean name = true;
//        if (name) {
//            System.out.println("Name is set");
//        }
    }

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int calculate(int x, int y, String op) {
        if (op.equals("+")) {
            return x + y;
        }
        if (op.equals("-")) {
            return x - y;
        }
        if (op.equals("/")) {
            return x / y;
        }
        if (op.equals("*")) {
            return x * y;
        }
        return 0;
    }
}
