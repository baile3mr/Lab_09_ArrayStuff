import java.util.Scanner;

public class SafeInput
{

    // Part A
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";

        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    // Part B
    public static int getInt(Scanner pipe, String prompt)
    {
        int value = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine(); // clear buffer
                done = true;
            }
            else
            {
                System.out.println("Invalid input. Enter an integer.");
                pipe.nextLine(); // trash input
            }

        } while (!done);

        return value;
    }

    // Part C
    public static double getDouble(Scanner pipe, String prompt)
    {
        double value = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                System.out.println("Invalid input. Enter a double.");
                pipe.nextLine();
            }

        } while (!done);

        return value;
    }

    // Part D
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int value = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine();

                if (value >= low && value <= high)
                    done = true;
                else
                    System.out.println("Out of range.");
            }
            else
            {
                System.out.println("Invalid input.");
                pipe.nextLine();
            }

        } while (!done);

        return value;
    }

    // Part E
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double value = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine();

                if (value >= low && value <= high)
                    done = true;
                else
                    System.out.println("Out of range.");
            }
            else
            {
                System.out.println("Invalid input.");
                pipe.nextLine();
            }

        } while (!done);

        return value;
    }

    // Part F
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String input;

        do
        {
            System.out.print("\n" + prompt + " [Y/N]: ");
            input = pipe.nextLine();

            if (input.equalsIgnoreCase("Y"))
                return true;
            else if (input.equalsIgnoreCase("N"))
                return false;
            else
                System.out.println("Invalid input.");

        } while (true);
    }

    // Part G
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String input;

        do
        {
            System.out.print("\n" + prompt + ": ");
            input = pipe.nextLine();

            if (input.matches(regEx))
                return input;
            else
                System.out.println("Invalid format.");

        } while (true);
    }

    // Part H (Pretty Header)
    public static void prettyHeader(String msg)
    {
        int width = 60;
        int msgLen = msg.length();
        int spaces = (width - 6 - msgLen) / 2;

        // Top line
        for(int i = 0; i < width; i++)
            System.out.print("*");
        System.out.println();

        // Middle line
        System.out.print("***");
        for(int i = 0; i < spaces; i++)
            System.out.print(" ");

        System.out.print(msg);

        for(int i = 0; i < (width - 6 - spaces - msgLen); i++)
            System.out.print(" ");

        System.out.println("***");

        // Bottom line
        for(int i = 0; i < width; i++)
            System.out.print("*");
        System.out.println();
    }
}