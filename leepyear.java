import java.util.*;
class sample
{
   Scanner sc = new Scanner(System.in);
   sample()
   {
    System.out.println("enter the year");
    int x=sc.nextInt();
    if(x%4==0)
    {
        System.out.println("its an leep year");
    }
    else
    {
        System.out.println("its not an leep year ");
    }
   }
}
class leepyear
{
    public static void main(String arg[])
    {
        sample obj = new sample();
        
    }
}
