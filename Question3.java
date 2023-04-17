import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int Int = in.nextInt();
    int prod = Int * Int;
    System.out.println("The answer is " + prod);
  }
}
