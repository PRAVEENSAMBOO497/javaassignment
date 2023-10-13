import java.util.Scanner;
import java.lang.Math;
public class mathexample 
   {
      public static void main(String ag[])
      {

        Scanner sc=new Scanner(System.in);
          System.out.println("Enter the marks1");
           int x=sc.nextInt();
          System.out.println("Enter the second mark2");
           int x1=sc.nextInt();

           System.out.print(Math.max(x,x1));
              System.out.println("  The max value is" );
      }
   }