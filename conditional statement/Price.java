import java.util.Scanner;
public class Price {
  public static void main(String[] args) {
    System.out.println("How much money you have:");
    Scanner sc = new Scanner(System.in);
    int money = sc.nextInt();

    System.out.println("You have: ₹" + money);

    if (money < 50)
      System.out.println("You can only buy a pen");
    else if (money >= 50 && money < 100)
      System.out.println("You can only buy a copy");
    else
      System.out.println("You can buy both copy and pen");

    sc.close(); // Good practice to close Scanner
  }
}
