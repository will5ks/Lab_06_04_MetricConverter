import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declarations
        Scanner in = new Scanner(System.in);

        double meters = 0;
        double inches;
        double feet;
        double miles;

        //User Prompt
        System.out.print("Enter a measurement in meters: ");

        //User Input and Verification
        if (in.hasNextDouble()) {
            meters = in.nextDouble();
        } else {
            System.out.println("Not a valid input, please re-run the program to try again.");
            System.exit(0);
        }

        //Calculations
        inches = meters * 39.37;
        feet = inches * 12;
        miles = feet * 5280;

        //Output to User
        System.out.print(meters + " meters is ");
        System.out.printf("%.3f inches, ", inches);
        System.out.printf("%.3f feet, or ", feet);
        System.out.printf("%.3f miles.", miles);
    }
}