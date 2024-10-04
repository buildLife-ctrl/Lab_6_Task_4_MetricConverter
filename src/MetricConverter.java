import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variable
        double inputMeters = 0;
        final double METERS_TO_MILES = 0.00062137;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.37008;
        boolean check = false;
        double miles;
        double feet;
        double inches;

        //checks for valid input
        do {
            //asks for meters
            System.out.println("Enter meter measurements:");
            if (scan.hasNextDouble()) {
                inputMeters = scan.nextDouble();
                if (inputMeters > 0) {
                    check = true; //breaks the loop
                } else {
                    System.out.println("You have entered an invalid meter measurement.");
                }
            } else {
                System.out.println("Please enter a valid data type.");
            }
            scan.nextLine();
        } while (!check);

        //calculations and output
        if (check) {
            miles = inputMeters * METERS_TO_MILES;
            feet = inputMeters * METERS_TO_FEET;
            inches = inputMeters * METERS_TO_INCHES;
            System.out.printf("%-8s %8.2f", "Meters:", inputMeters);
            System.out.printf("\n%-8s %8.2f", "Miles:", miles);
            System.out.printf("\n%-8s %8.2f", "Feet:", feet);
            System.out.printf("\n%-8s %8.2f", "Inches:", inches);
        }
    }
}