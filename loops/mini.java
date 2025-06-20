import java.util.Scanner;
public class mini {
  public static void main(String[] args)
 {
  
  int num;
    do{
      System.out.println("Enter the number");
      Scanner sc= new Scanner(System.in);
      num=sc.nextInt();
      System.out.println("Your number is "+num);
    }

    while(num>=0);
    System.out.println("The end");

 } 
}
