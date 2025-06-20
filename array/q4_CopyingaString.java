import java.util.Arrays;
public class q4_CopyingaString
{
  public static void main(String[] arg)

{
  int [] a= new int[5];
  a[0]=1;
  a[1]=2;
  a[2]=3;
  a[3]=4;
  a[4]=5;
  int [] b=Arrays.copyOf(a,a.length);
  System.out.println(Arrays.toString(b));

}
}