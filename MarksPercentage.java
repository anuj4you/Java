// program to take 5 marks input then give percentage for student :

 import java.util.Scanner;

public class MarksPercentage {


    public static void main(String[] args) {
        int m1,m2,m3,m4;
        float avg;
        System.out.println("Please enter marks for all 5 subjects : ");
        Scanner scn = new Scanner(System.in);
        m1 = scn.nextInt();
        m2 = scn.nextInt();
        m3 = scn.nextInt();
        m4 = scn.nextInt();
        avg = (m1 + m2 + m3 + m4)/4;
        System.out.println("received input -> Calculating average now **** ");
        System.out.println("Average is " + avg);

    // Program to check if input is integer or not:
        System.out.println("Please enter input to check for integer..");
        boolean intInput = scn.hasNextInt();
        if (intInput == true){
            System.out.println("You entered integer.");

        }
        else{
            System.out.println("sorry integer not entered..");
        }

    }
}
