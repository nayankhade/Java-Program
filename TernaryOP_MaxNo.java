public class TernaryOP_MaxNo {
    public static void main(String[] args) {

        int a = 12, b = 180, c = 100;
        int result = 0;

        result = a > c ? a > b ? a : b : b > c ? b : c; // Nested if else is using in ternary Op

        System.out.println("Largest Number is " + result);
    }
}
