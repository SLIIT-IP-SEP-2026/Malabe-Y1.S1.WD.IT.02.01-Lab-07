import java.util.Scanner;
public class IT26102599Lab7Q1B{
public static void main(String[] args){

int subject1,subject2,subject3,subject4;
double average;

Scanner input=new Scanner(System.in);

for(i=1; i<4; i++)

 System.out.println("sunject:" + i);
  System.out.print("Enter marks: ");
			
subject1=input.nextInt();
subject2=input.nextInt();
subject3=input.nextInt();
subject4=input.nextInt();

average=(subject1+subject2+subject3+subject4)/4.0;

System.out.println("average:"+average);

if (average >= 75 && average <= 100) {
    System.out.println("Distinction");
}
else if (average >= 50 && average < 75) {
    System.out.println("Credit");
}
else {
    System.out.println("Fail");
}
	

}
}