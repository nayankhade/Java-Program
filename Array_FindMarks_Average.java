import java.util.Scanner;

public class Array_FindMarks_Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of student : ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Marks of Subjects : ");
            marks[i] = sc.nextInt();
        }
        int total = 0, averageMarks;
        for (int i = 0; i < n; i++) {
            total += marks[i];
        }
        averageMarks = total / n;
        System.out.println("the average marks are : " + averageMarks);

    }
}
