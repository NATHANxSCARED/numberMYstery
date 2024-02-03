/*
    * Codeur : Nathan Vittoni
    * email : nathan@vittoni.ch
    * projec : number mysterie
    * date : 26 janvier 2024
    * type : interface
*/
package org.game.interfaces;

import java.util.Random;
public interface mysetryNumber {


    static int mysteryNumber(){
        Random randomHP = new Random();

         int randomNum = randomHP.nextInt(1,100);
         return randomNum;
    }

}
