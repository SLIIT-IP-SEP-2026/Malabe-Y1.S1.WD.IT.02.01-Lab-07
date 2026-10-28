import java.util.Scanner;
public class IT26102740Lab7Q1B{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        double mark, total = 0, average;

        for(int x = 1 ; x <=3 ; x++){
        total = 0;
        System.out.println("Student "+ x);

        System.out.print("Enter marks :");
        for(int i = 1; i <= 4 ; i++){
            mark = input.nextDouble();
            total = total + mark;
        }
        average = total / 4;
        System.out.println("Average is : "+average);

        if (average <= 100 && average >= 75){
            System.out.println("Overall grade is : Distinction");
        }
        else if(average <= 74 && average >= 50){
            System.out.println("Overall grade is : Credit");
        }
        else if(average <= 49 && average >= 0){
            System.out.println("Overall grade is : Fail");
        }
        System.out.println();
        }
        
    }
}