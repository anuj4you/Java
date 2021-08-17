import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        Random ran = new Random();

        int num = ran.nextInt(100);  // range of random numbers - 100. (0-99)

        System.out.println("Let's see what random number we got between 200 - 300 : ");
        System.out.println(num += 201); //add 201 for range from 200 - 300


    }
}
