import java.util.Scanner;

public class Count_NumberofDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int numberOfDigits = (int) Math.log10(n) + 1;
        System.out.println(numberOfDigits);
    }
}
