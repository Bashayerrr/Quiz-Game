import java.util.Scanner;

/**
 * Hey! This is my first Java quiz program.
 * It covers basics like data types and method entry points.
 */
public class MyQuizGame {

    public static void main(String[] args) {
        // Setting up the scanner and my score trackers
        Scanner input = new Scanner(System.in);
        int correctCount = 0;
        int totalQs = 5;
        char userAnswer;

        System.out.println("--- Welcome to My Java Basics Quiz! ---");
        System.out.println("Answer with A, B, C, or D. Let's see what you know!\n");

        // Question 1
        System.out.println("1. Which data type should I use for a single character?");
        System.out.println("A) String  B) char  C) int  D) boolean");
        System.out.print("Your choice: ");

        // I used toUpperCase() here so it doesn't matter if the user types 'b' or 'B'
        userAnswer = input.next().toUpperCase().charAt(0);

        switch (userAnswer) {
            case 'A': case 'B': case 'C': case 'D':
                if (userAnswer == 'B') {
                    System.out.println("Nice! That's correct.");
                    correctCount++;
                } else {
                    System.out.println("Oops, that's not it. It was B.");
                }
                break;
            default:
                System.out.println("That wasn't even an option! Moving on...");
        }
        System.out.println();

        // Question 2
        System.out.println("2. What's the default value for an 'int' in Java?");
        System.out.println("A) 0  B) 1  C) null  D) -1");
        System.out.print("Your choice: ");
        userAnswer = input.next().toUpperCase().charAt(0);

        switch (userAnswer) {
            case 'A': case 'B': case 'C': case 'D':
                if (userAnswer == 'A') {
                    System.out.println("Correct! Java likes to default to 0.");
                    correctCount++;
                } else {
                    System.out.println("Incorrect. The answer was A.");
                }
                break;
            default:
                System.out.println("Invalid input detected.");
        }
        System.out.println();

        // Question 3
        System.out.println("3. To make a subclass, which keyword do we use?");
        System.out.println("A) implements  B) inherits  C) extends  D) plus");
        System.out.print("Your choice: ");
        userAnswer = input.next().toUpperCase().charAt(0);

        switch (userAnswer) {
            case 'A': case 'B': case 'C': case 'D':
                if (userAnswer == 'C') {
                    System.out.println("You got it!");
                    correctCount++;
                } else {
                    System.out.println("Wrong choice. It's 'extends'.");
                }
                break;
            default:
                System.out.println("Invalid input.");
        }
        System.out.println();

        // Question 4
        System.out.println("4. Which of these can NOT be a variable name?");
        System.out.println("A) _myVar  B) 2ndVar  C) $money  D) Java_8");
        System.out.print("Your choice: ");
        userAnswer = input.next().toUpperCase().charAt(0);

        switch (userAnswer) {
            case 'A': case 'B': case 'C': case 'D':
                if (userAnswer == 'B') {
                    System.out.println("Correct! You can't start a variable name with a number.");
                    correctCount++;
                } else {
                    System.out.println("Actually, that's a valid name. B was the invalid one.");
                }
                break;
            default:
                System.out.println("Invalid input.");
        }
        System.out.println();

        // Question 5
        System.out.println("5. Where does the program start running?");
        System.out.println("A) start()  B) begin()  C) main()  D) execute()");
        System.out.print("Your choice: ");
        userAnswer = input.next().toUpperCase().charAt(0);

        switch (userAnswer) {
            case 'A': case 'B': case 'C': case 'D':
                if (userAnswer == 'C') {
                    System.out.println("Spot on! The main method is the entry point.");
                    correctCount++;
                } else {
                    System.out.println("Nope, it's the main method (C).");
                }
                break;
            default:
                System.out.println("Invalid input.");
        }
        System.out.println();

        // Time to do some math for the final score
        // I casted correctCount to a double here so the division doesn't mess up
        double finalPercent = ((double) correctCount / totalQs) * 100;

        System.out.println("===============================");
        System.out.println("ALL DONE!");
        System.out.println("You got " + correctCount + " out of 5 right.");
        System.out.println("Final Score: " + finalPercent + "%");
        System.out.println("===============================");

        input.close();
    }
}
