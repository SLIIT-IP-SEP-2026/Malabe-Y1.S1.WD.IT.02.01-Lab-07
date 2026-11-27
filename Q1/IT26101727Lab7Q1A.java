import java.util.Scanner;

public class IT26101727Lab7Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] marks = new int[4];
        double average;
        int total = 0;

        
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();

            total = total + marks[i];
        }

        
        average = total / 4.0;

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
