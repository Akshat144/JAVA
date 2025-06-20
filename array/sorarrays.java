import java.util.Arrays;
public class sorarrays {
  public static void main(String[] args) {
      
    int [] num= new int [3] ;
    num[0]=1;
    num[1]=2;
    num[2]=3;
    int [] num2= Arrays.copyOf(num,num.length);
    System.out.println(num2[0]);
    
}}
