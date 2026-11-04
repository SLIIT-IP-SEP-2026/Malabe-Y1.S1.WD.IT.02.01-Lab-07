
 public class IT26102764Lab7Q2B{
     
     public static void main(String[] aargs){

       //define variables
         int i, j;
        
      // loop 
         for(i=1; i<=5; i++){
            System.out.print(i+"-");

            for (j=1; j<=i;j++){
              System.out.print("*");
            }
            System.out.println("\n");
         } 
     }
 }