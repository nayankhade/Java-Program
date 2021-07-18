import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = sc.nextInt();
        if (year%100!=0) {
            if (year%4==0) {
                System.out.println("Leap Year\n");
            }else{
                System.out.println("Not Leap Year\n");
            }
        }
    }
}
