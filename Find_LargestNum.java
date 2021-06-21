public class Find_LargestNum {
    public static void main(String[] args) {

        int a = 12, b = 8, c = 3;
        int result = 0;

        if (a > c) {
            if (a > b) {
                result = a;
            } else {
                result = b;
            }
        } else {
            if (b > c) {
                result = b;
            } else {
                result = c;
            }
        }

        System.out.println("Largest of the three numbers is " + result);
    }
}
