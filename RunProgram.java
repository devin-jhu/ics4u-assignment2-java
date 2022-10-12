/*
*
* The run calculator
*
* @author  Devin Jhu
* @version 1.0
* @since   2022-10-11
*
* This is a run program.
*/

import java.util.Scanner;
/**
 * The run calculator.
 */

final class RunProgram {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private RunProgram() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param userInput the users userInput
    * @return count Returns the run
    */

    public static int runCalculation(final String userInput) {
        // Variables.
        int total = 0;
        int counter = 0;
        char previous = ' ';

        // counts how many occrances of a charactor are in
        // a string that the userInputtedArray.
        for (char usersRun: userInput.toCharArray()) {

            // if they equal eachother the counter will go up by 1.
            if (usersRun == previous) {
                total++;

            } else {
                total = 1;
                previous = usersRun;
            }

            // the count is the total run that is found
            // within the string inputted.
            if (total > counter) {
                counter = total;
            }
        }

        // returns the total run in count to the main
        // function to output the result.
        return counter;

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {

        // input
        System.out.println("This will find the run in a string ex. xyyz run=2");

        final Scanner userWord = new Scanner(System.in);
        System.out.print("Enter string: ");

        // conerts the word inputted to userInput.
        final String userInput = userWord.nextLine();

        // gets the maxRun of the program.
        final int maxRun = runCalculation(userInput);

        // output
        System.out.println("The highest run is " + maxRun + "!");
        System.out.println("\nDone!");

    }
}
