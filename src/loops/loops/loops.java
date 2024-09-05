package loops;  

import java.util.Scanner;
// import scanner to allow for user input
public class loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//create new scanner for scanner to work
        // Declare variables
        double[] values = new double[5];
        double total = 0, max = Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY;

        int count = 0;  // Counter for valid inputs to always do 5

        while (count < 5) {
            System.out.print("Enter number " + (count + 1) + ": ");
            if (scanner.hasNextDouble()) {  // Check if input is a valid number
                double value = scanner.nextDouble();
                values[count] = value;  // Store the value in array 
                total += value;  // Add to total

                // Update max and min
                if (value > max) max = value;
                if (value < min) min = value;

                count++;  // Move to next input
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();  // Clear the invalid input 
            }
        }

        // Calculate and display results to user
        double average = total / 5;
        double interest = total * 0.20;

        System.out.printf("\nTotal: %.2f\nAverage: %.2f\nMax: %.2f\nMin: %.2f\n20%% Interest: %.2f%n", total, average, max, min, interest);

        scanner.close();  // Close scanner
    }
}
