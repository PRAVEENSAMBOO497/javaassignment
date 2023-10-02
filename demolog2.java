import java.util.*;
class sample
{
    Scanner sc=new Scanner(System.in);
    sample()
    {
        System.out.println("Enter the Number");
        int x=sc .nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
          if(((x<y)&&(y<z)) || ((z<x)&&(z<x)))
          {
            System.out.println("all are true");
          }
          else
          {
            System.out.println("wrong answer");
          }
    }
}
class demolog2
{
    public static void main(String ar[])
    {
      sample obj=new sample();
    }
}