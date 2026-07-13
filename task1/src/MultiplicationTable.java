/**
 * Class to print the multiplication table for a given base number
 * from 1 to 10 using a for loop.
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        // Declare the base number for the multiplication table
        int base = 9;

        // Loop ranges from 1 to 10 inclusive to generate the multiplier
        for (int i = 1; i <= 10; i++) {

            // Calculate the product of the base and the current loop counter
            int result = base * i;

            // Print the line using string concatenation in the format: base x counter = result
            System.out.println(base + " x " + i + " = " + result);
        }
    }
}
