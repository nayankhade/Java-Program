import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Emter a Number : ");
        int n = sc.nextInt();
        int i;
        boolean isPrime = true;

        for (i = 2; i * i < n; i++) {

            if (n % i == 0)
                isPrime = false;
            break;
        }
        if (n < 2)
            isPrime = false;

        System.out.println("isPrime " + isPrime);
    }
}