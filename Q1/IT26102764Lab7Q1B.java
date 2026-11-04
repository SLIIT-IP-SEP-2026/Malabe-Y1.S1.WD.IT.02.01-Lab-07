import java.util.Scanner;
 
  public class IT26102764Lab7Q1B{

    public static void main ( String[] args){

    // define the variables
     int sub1,sub2,sub3,sub4;
     double avg;
    String grade;
 
    // create the object 
      Scanner input = new Scanner(System.in);

    // loops to get user input for three times
      for (int s3=1; s3<=3; s3++){
        System.out.println("Student"+s3+":");
        System.out.print("Enter Marks:");
     

      // get user inputs for the variables in one line
        sub1=input.nextInt();
        sub2=input.nextInt();
        sub3=input.nextInt();
        sub4=input.nextInt();

      // calculate the average
      avg= (sub1+sub2+sub3+sub4)/4.0;

      // grade presenting loop
      if ((avg>=75)&&(avg<=100)){
        grade= "Distinction";
      }
      else if ((avg>=50)&&(avg<=74)){
        grade= "Credit";
      }
      else{
        grade= "Fail";
      }

     // print average and the credit
      System.out.println("Average is:"+ avg);
      System.out.println("Overall Grade is :"+ grade);
      System.out.println();
      }

    }
 }