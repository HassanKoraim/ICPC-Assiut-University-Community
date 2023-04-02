import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    Long a = in.nextLong ();
    Long b = in.nextLong ();
    Long sum = a - b;

    if (sum >= 0)
      {
	System.out.println (sum);
      }
    else
      {
	System.out.println (0);
      }
  }
}
