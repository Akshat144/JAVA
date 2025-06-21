import java.util.Scanner;

public class NumberGuessing {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("This is a number Guessing game");
    System.out.println("Choose a number between 0-100 (Enter a negative number to quit)");

    int guess = (int)(Math.random() * 101); // 0 to 100
    int num = -1;

    while (true) {
      num = sc.nextInt();

      if (num < 0) {
        System.out.println("You chose to quit the game.");
        System.out.println("The correct number was: " + guess);
        break;
      }

      if (num < guess) {
        System.out.println("Sorry, your guess is less than the number.");
      } else if (num > guess) {
        System.out.println("Sorry, your guess is greater than the number.");
      } else {
        System.out.println("🎉 Congratulations! You guessed the number.");
        break;
      }

      System.out.println("Try again:");
    }

    sc.close();
  }
}
