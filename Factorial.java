import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int fact = 1, i;
        for (i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial : " + fact);
    }
}
