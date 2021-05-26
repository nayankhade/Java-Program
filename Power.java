import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and power : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 1, i;

        for (i = 1; i <= b; i++) {
            result = result * a;
        }
        System.out.println(result);
    }
}
