import java.util.Scanner;

public class Subjects_Marks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the max marks of each subject : ");
        System.out.print("Enter 1st Subejct Marks : ");
        float s1 = sc.nextFloat();
        System.out.print("Enter 2st Subejct Marks : ");
        float s2 = sc.nextFloat();
        System.out.print("Enter 3st Subejct Marks : ");
        float s3 = sc.nextFloat();
        System.out.print("Enter 4st Subejct Marks : ");
        float s4 = sc.nextFloat();
        System.out.print("Enter 5st Subejct Marks : ");
        float s5 = sc.nextFloat();

        float total, average, percentage;
        total = s1 + s2 + s3 + s4 + s5;
        average = total / 5;
        percentage = (total / 500) * 100;
        System.out.print("total Marks = " + total);
        System.out.print("\nAverage = " + average);
        System.out.print("\nPercentage = " + percentage);
    }
}