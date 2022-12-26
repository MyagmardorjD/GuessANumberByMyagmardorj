package FundamentalsWarmUp.GuessANumberByMyagmardorj;

import java.util.Random;
import java.util.Scanner;

public class guessANumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int computerNumber = random.nextInt(100);
        while(true){
            System.out.println("Guess a number (1-100): ");
            String playerInput = scanner.nextLine();
            boolean isValid = true;
            for(int i = 0; i < playerInput.length();i++) {
                if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                int playerNumber = Integer.parseInt(playerInput);
                if (playerNumber == computerNumber){
                    System.out.println("You guessed it!");
                    break;
                } else if (playerNumber > computerNumber) {
                    System.out.println("Too high");
                }else {
                    System.out.println("Too low");
                }
            }else {
                System.out.println("Invalid input");
            }
        }

    }
}
