import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Welcome to the 'Guess The Number Game'");
        Scanner scanner = new Scanner(System.in);
        // make random numbers range 1-100
        int random = (int) (Math.random() * 100) + 1;
        //System.out.println(random);
        int lives = 10;
        int input = 0;
        System.out.println("Guess the number:");
        while (lives != 0) {
            input = scanner.nextInt();

            if (input == random) {
                System.out.println("You guessed it right");
                break;
            } else if (input > random) {
                System.out.println("\nGuess lower");
                lives--;
                System.out.println("You have " + lives + " lives left");
                System.out.println("Guess again:");
            } else {
                System.out.println("\nGuess higher");
                lives--;
                System.out.println("You have " + lives + " lives left");
                System.out.println("Guess again:");
            }
        }
    }
}