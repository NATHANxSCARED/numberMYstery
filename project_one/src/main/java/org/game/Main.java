/*
* Name : Nathan Vittoni
* Date : 19 janvier 2024
* Project name : Number mystey
* But : l'utilisateur doit deviner le nombre generer
*/
// __________________________________________________

// __________________________________________________
// add package
    package org.game;
// __________________________________________________

// __________________________________________________
// import for this project
    import java.util.Random;
    import java.util.Scanner;
    import static java.lang.System.exit;
// __________________________________________________

// __________________________________________________
// class main
    public class Main {
        public static void main(String[] args) {
            // Generate a random number between 1 and 20
            Random random = new Random();
            int randomNumber = random.nextInt(20) + 1;

            // Create a Scanner object for user input
            Scanner scan = new Scanner(System.in);

            // Welcome message and prompt for the user's name
            System.out.println("Hello, welcome to the Mystery Number Game in Java!");
            System.out.println("What is your name? ");
            String name = scan.next();
            Game gamer = new Game(name);
    /// ------------

    /// ------------
        // ceat variable Index with default value is null
        boolean i = false;
      do {
            // Display the challenge to the user
            System.out.println("I've selected a random number between 2 and 21. Can you guess it, " + gamer.getHostName() + "?");

            // Prompt the user to enter their guess
            System.out.print("Enter your guess number: ");
            String response = scan.next();

            // Convert the user's response to an integer
            int userGuess = Integer.parseInt(response);

            // Check if the guess is correct
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
            } else {
                // Display the correct number and ask if the user wants to try again
                System.out.println("Sorry, " + gamer.getHostName() + ", the correct number was: " + randomNumber);
                System.out.println("Would you like to try again? (Y/n)");

                // Get the user's response
                String userAvis = scan.next();

                // Check if the user wants to try again
                if (userAvis.equalsIgnoreCase("Y")) {
                    // Ask if the user wants to change their name
                    System.out.println("Did you change your name? (Y/n)");
                    String questionName = scan.next();

                    // Check if the user wants to change their name
                    if (questionName.equalsIgnoreCase("Y")) {
                        // Prompt for the new name and update the Game object
                        System.out.println("What is your new name? ");
                        String newName = scan.next();
                        gamer.setHostName(newName);
                        i = true;
                    } else {
                        System.out.println("No problem.");
                        i = true;
                    }
                } else {
                    // End the game if the user does not want to try again
                    System.out.println("Sorry, have a good day.");
                    exit(0);
                }
            }
        }  while(i = true);
    }
}
// __________________________________________________
// end of this prorject

