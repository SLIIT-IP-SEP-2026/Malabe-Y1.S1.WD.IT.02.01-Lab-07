import java.util.Scanner;

public class IT26102776Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter marks for four subjects:");
        
		System.out.print("Enter Subject Mark 1: ");
        double m1 = input.nextDouble();
       
	    System.out.print("Enter Subject Mark 2: ");
        double m2 = input.nextDouble();
        
		System.out.print("Enter Subject Mark 3: ");
        double m3 = input.nextDouble();
        
		System.out.print("Enter Subject Mark 4: ");
        double m4 = input.nextDouble();
        
        double average = (m1 + m2 + m3 + m4) / 4.0;
        System.out.println("\nAverage is : " + average);
        
        String grade = "";
        
		if (average >= 75 && average <= 100) {
            grade = "Distinction";
        
		} else if (average >= 50 && average <= 74) {
            grade = "Credit";
        
		} else if (average >= 0 && average <= 49) {
            grade = "Fail";
        }
        
        System.out.println("Overall Grade is : " + grade);
    }
}
