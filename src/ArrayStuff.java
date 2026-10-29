import java.util.Random;
import java.util.Scanner;

public class ArrayStuff
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // Declare an array of 100 integers
        int[] dataPoints = new int[100];

// Verify the array length
        System.out.println("Array length: " + dataPoints.length);

        // Task 2
        // Create Random object
        Random rnd = new Random();

// Loop through array and fill with random values
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;  // 1 to 100
        }

        System.out.println("Task 2: Array filled with random values (1-100)");

        // Task 3
        // Display values separated by " | "
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();  // New line after all values

        // Task 4 (sum + average)
        // Calculate sum
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }

// Calculate average (cast to double for decimal result)
        double average = (double) sum / dataPoints.length;

// Display with clear descriptions
        System.out.println("The sum of all values in the dataPoints array is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        // Task 5
        int userValue = SafeInput.getRangedInt(in, "Enter value to search", 1, 100);
        System.out.println("You entered: " + userValue);

        // Task 6 (count occurrences)
        // Count occurrences of user's value
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }

// Display result with clear feedback
        System.out.println("The value " + userValue + " was found " + count + " time(s) in the array.");


        // Task 7 (find first occurrence)
        // Prompt for another value
        int searchValue = SafeInput.getRangedInt(in, "Enter value to find first position", 1, 100);
        boolean found = false;

        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == searchValue)
            {
                System.out.println("The value " + searchValue + " was found at array index " + i);
                found = true;
                break;
            }
        }

        if(!found)
        {
            System.out.println("The value " + searchValue + " was not found in the array.");
        }

        // Task 8 (min and max)
        // Initialize min and max with first element
        int min = dataPoints[0];
        int max = dataPoints[0];

// Iterate through remaining elements
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

// Display results
        System.out.println("The minimum value in the data Points array is: " + min);
        System.out.println("The maximum value in the data Points array is: " + max);


        // Task 9 (method call)
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    // Task 9 method
    public static double getAverage(int values[])
    {
        int sum = 0;

        for(int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }

        return (double) sum / values.length;
    }
    }
