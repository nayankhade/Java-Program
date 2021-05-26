import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i;
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");

        for (i = 2; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
