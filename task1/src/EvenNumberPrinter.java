public class EvenNumberPrinter {
    /**
     * Class to analyze numbers, print even numbers,
     * and calculate their count and total sum.
     */


        public static void main(String[] args) {
            // Declare and initialize the upper boundary for our loop
            int limit = 20;

            // Track the total number of even numbers found
            int count = 0;

            // Track the cumulative sum of all even numbers found
            int sum = 0;

            // Loop from 1 up to and including the limit (20)
            for (int i = 1; i <= limit; i++) {

                // Check if the current number is perfectly divisible by 2 with no remainder
                if (i % 2 == 0) {
                    // Print the identified even number on a new line
                    System.out.println(i);

                    // Increment the counter by 1
                    count++;

                    // Add the current even number to the running total sum
                    sum = sum + i;
                }
            }

            // Print final statistics after analyzing all numbers
            System.out.println("Total count of even numbers: " + count);
            System.out.println("Total sum of all even numbers: " + sum);
        }
    }
