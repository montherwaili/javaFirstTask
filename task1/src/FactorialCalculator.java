/**
 * Class to calculate the factorial of a given integer
 * using a while loop.
 */
public class FactorialCalculator {

    public static void main(String[] args) {
        // Initialize the target number for factorial calculation
        int number = 7;

        // Initialize factorial to 1; using long because factorials grow very quickly
        long factorial = 1;

        // Initialize the loop counter variable to 1
        int i = 1;

        // Loop runs as long as the counter is less than or equal to the target number
        while (i <= number) {

            // Multiply the current factorial total by the counter variable
            factorial = factorial * i;

            // Increment the loop counter by 1 to move to the next integer
            i++;
        }

        // Print the original target number
        System.out.println("Original number: " + number);

        // Print the final calculated factorial value
        System.out.println("Calculated factorial: " + factorial);
    }
}

