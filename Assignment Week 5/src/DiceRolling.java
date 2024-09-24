// <DiceRolling.java> 
// This application simulates rolling two dice, sums the results, 
// and stores the count of possible sums (from 2 to 12) in an array. 
// After running the simulation 36,000 times, it prints a table of the sums and their frequencies.

//CSIS 212-<WEEK 5>
import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        // Class related print statement
        System.out.println("David Ryan Lynch - Dice Rolling Assignment");

        // Create an array to hold counts for sums from 2 to 12
        // Indexes 0 and 1 will be unused
        int[] sumCounts = new int[13];

        // Create a Random object for generating random numbers
        Random random = new Random();

        // Roll the dice 36,000 times
        for (int i = 0; i < 36000; i++) {
            // Roll the first die (generates a number between 1 and 6)
            int die1 = random.nextInt(6) + 1;
            // Roll the second die (generates a number between 1 and 6)
            int die2 = random.nextInt(6) + 1;

            // Calculate the sum of the two dice
            int sum = die1 + die2;

            // Increment the count for this sum in the sumCounts array
            sumCounts[sum]++;
        }

        // Display results in a tabular format
        System.out.printf("%-10s %-10s%n", "Sum", "Frequency");

        // Header separator line
        System.out.println("-----------------------");
        
        // Loop through sumCounts and print the frequency for each sum
        for (int sum = 2; sum <= 12; sum++) {
            System.out.printf("%-10d %-10d%n", sum, sumCounts[sum]);
        }
    }
}

