public class SwitchCase {
    public static void main(String[] args) {

        int dayOfWeek = 2;

        switch (dayOfWeek) {
            case 1:
                System.out.println("I am on leave");
                break;
            case 2:
                System.out.println("I am in office");
                break;
            case 3:
                System.out.println("I am playing footbal");
                break;

            default:
                System.out.println("I don't lnow what day it is");
        }

    }
}