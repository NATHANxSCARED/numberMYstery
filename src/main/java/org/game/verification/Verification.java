/*
 * Name : Nathan Vittoni
 * Date : 19 janvier 2024
 * Project name : Number mystey
 * But : cette class set a egader et vérifier que le nombre rentrer par l'utilisateur est bien un nombre et que ce dernier est compris entre 2 et 23
 */

// ceate package verification
package org.game.verification;

// class Verification
public class Verification {

    public int verification(String value){
        try {
            // Convert the value to an integer
            return Integer.parseInt(value);
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid integer.");
                // Indicate a failed conversion
              return -1; 
            }

    }

}
