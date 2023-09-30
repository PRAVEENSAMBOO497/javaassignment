import java.util.*;
class sample
{
   Scanner sc = new Scanner(System.in);
   sample()
   {
     System.out.println("Hi user; enter your number ");
     int x=sc.nextInt();
     if(x<0)
     {
        System.out.println("number is possitive ");
     }
     else if (x>0)
     {
        System.out.println("number is negative");
     }
     else
     {
        System.out.println("number is zero");
     }
   }
}
class contisional
{
   public static void main(String ah[])
   {
    sample obj=new sample();
   }
}