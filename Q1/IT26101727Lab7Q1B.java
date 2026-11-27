import java.util.Scanner;

public class IT26101727Lab7Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] marks = new int[3][4];
        double average;

       
        for (int i = 0; i < 3; i++) {

            System.out.print("Enter four subject marks for Student " + (i + 1) + ": ");

            for (int j = 0; j < 4; j++) {
                marks[i][j] = input.nextInt();
            }
        }

       
        for (int i = 0; i < 3; i++) {

            int total = 0;

            for (int j = 0; j < 4; j++) {
                total = total + marks[i][j];
            }

            average = total / 4.0;

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Average: " + average);

            if (average >= 75) {
                System.out.println("Grade: Distinction");
            }
            else if (average >= 50) {
                System.out.println("Grade: Credit");
            }
            else {
                System.out.println("Grade: Fail");
            }
        }

       
    }
}
