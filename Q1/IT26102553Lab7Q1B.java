
import java.util.Scanner;

public class Lab7Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Student " + i);

            System.out.print("Enter marks for four subjects: ");

            int mark1 = input.nextInt();
            int mark2 = input.nextInt();
            int mark3 = input.nextInt();
            int mark4 = input.nextInt();

            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

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

            System.out.println();
        }
    }
}
