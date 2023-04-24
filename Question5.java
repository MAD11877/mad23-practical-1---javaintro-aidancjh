import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
        int numIntegers = scanner.nextInt();

        // Create an array to hold the integers
        int[] integers = new int[numIntegers];

        // Prompt the user to enter the integers
        for (int i = 0; i < numIntegers; i++) {
            integers[i] = scanner.nextInt();
        }

        // Find the mode of the integers
        int mode = 0;
        int maxCount = 0;
        for (int i = 0; i < numIntegers; i++) {
            int count = 0;
            for (int j = 0; j < numIntegers; j++) {
                if (integers[j] == integers[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = integers[i];
            }
        }

        // Print the mode
        System.out.println(mode);
  }
}
