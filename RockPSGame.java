// Rock Paper Scissor game ->>>>>

import java.util.Random;
import java.util.Scanner;

public class RockPSGame {

    public static void main(String[] args) {

        // code to get random number from 200 to 400.
        // int randomNumber = ran.nextInt(100);
        // System.out.println(randomNumber + 200);

        // rock paper scissor rock>scissor, scissor>paper, paper > rock. call rock-1 paper-2, scissor-3

        Random ran = new Random();
        Scanner scn = new Scanner(System.in);
        System.out.println("Please input Rock , Paper, scissor or type exit to exit game:>>>>>");
        String userStr = scn.next();

        String userString = userStr.toLowerCase();

        int comp;

        comp = ran.nextInt(3) + 1;

        int user;
        // setting input string to user number to compare with random computer chosen number.
        if (userString.equals("exit")) {
            return;
        } else if (userString.equals("rock")) {
            user = 1;
            System.out.println("you choose : " + userStr);
        } else if (userString.equals("paper")) {
            user = 2;
            System.out.println("you choose : " + userStr);
        } else if (userString.equals("scissor")) {
            user = 3;
            System.out.println("you choose : " + userStr);
        } else {

            System.out.println("Invalid output please check and play again!");
            user = 0;
        }

        System.out.println("computer choose : " + comp);
        //System.out.println("user entered " + user);

        // comparison who won ?

        // rock paper scissor rock>scissor, scissor>paper, paper > rock. call rock-1 paper-2, scissor-3.

        if (comp == user) {
            System.out.println("It's a tie");
            System.out.println("you both choose same!");
        }

        if (comp == 1 & user == 3) {
            System.out.println("Computer won");
            System.out.println("computer choose rock you choose scissor");
        }

        if (comp == 2 & user == 1) {
            System.out.println("Computer won");
            System.out.println("computer choose paper you choose rock");
        }

        if (comp == 3 & user == 2) {
            System.out.println("Compute won");
            System.out.println("computer choose scissor you choose paper");
        }

        if (user == 1 & comp == 3) {
            System.out.println("You have won");
            System.out.println("you choose rock computer choose scissor");
        }

        if (user == 2 & comp == 1) {
            System.out.println("You have won");
            System.out.println("you choose paper computer choose rock");
        }

        if (user == 3 & comp == 2) {
            System.out.println("You have won");
            System.out.println("you choose scissor computer choose paper");
        }

        System.out.println("Thank you for playing!");

    }
}
