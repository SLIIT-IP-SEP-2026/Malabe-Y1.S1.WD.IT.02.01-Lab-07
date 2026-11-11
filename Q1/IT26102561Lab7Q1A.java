import java.util.Scanner;
public class IT26102561Lab7Q1A {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for four subjects: ");

        System.out.print("Enter Subject Mark 1: ");
        int mark1 = input.nextInt();

        System.out.print("Enter Subject Mark 2: ");
        int mark2 = input.nextInt();

        System.out.print("Enter Subject Mark 3: ");
        int mark3 = input.nextInt();

        System.out.print("Enter Subject Mark 4: ");
        int mark4 = input.nextInt();

        double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
        System.out.print("\nAverage is : " + average + "\n");

        if (average >= 75){
            System.out.println("Overall Grade is : Distinction");
        }
        else if (average >=50){
            System.out.println("Overall Grade is : Credit");
        }
        else{
            System.out.println("Overall Grade is : Fail");
        }

    }
    
}
