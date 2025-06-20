import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        boolean notPalindrome = true;

        while (notPalindrome) {
            int rev = 0, temp = num;
            while (temp != 0) {
                rev = rev * 10 + temp % 10;
                temp = temp / 10;
            }

            if (rev == num) {
                notPalindrome = false;  // palindrome found, exit loop next time
            } else {
                num = num + rev;
                System.out.println("Intermediate: " + num);
            }
        }

        System.out.println("Palindrome: " + num);
    }
}
