import java.util.Scanner;

 public class IT26102764Lab7Q2A{

  public static void main(String[] args){

    // number of rows and columns
     int rows=4;
     int columns=5;

    // loop through each row
     for (int rowCount=0; rowCount< rows; rowCount++){

        // loop through each column
        for(int columnCount=0; columnCount< columns; columnCount++){
           System.out.print("$");
        }
        // move to the next line after printing all the column in the row
         System.out.println();
     }
  }
 }