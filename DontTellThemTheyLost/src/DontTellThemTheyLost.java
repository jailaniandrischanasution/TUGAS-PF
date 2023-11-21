import java.util.Scanner;
import java.util.Random;

public class DontTellThemTheyLost {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an int from 1 to 10: ");
        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;

        if (inputNumber == randomNumber) {
            System.out.println("You win.");
            System.out.println("That was a very good guess :-)");
        } else {
            System.out.println("The random number was " + randomNumber + ".");
            System.out.println("Thank you for playing.");
        }

        keyboard.close();
    }
}
