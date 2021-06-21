import java.util.Scanner;

// Sum of the Digits of a number using While Loops

public class Sum_of_Digits {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int temp = n;
      int sum = 0;

      while (temp > 0) {
         int lastDigit = temp % 10;
         sum = sum + lastDigit;
         temp = temp / 10;
         System.out.println(lastDigit + "   " + temp + "   " + sum);
      }
      System.out.println("The sum of digits of " + n + " is " + sum);
   }
}
