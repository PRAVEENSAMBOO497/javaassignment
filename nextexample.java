 class sample   
     {
        sample()
        {
            float x=224.5f;
            double y= 22.55d;

              System.out.println(Math.nextAfter(x, y));
              System.out.println(Math.nextAfter(y, x));

               System.out.println("Always fine");
        }
     }
class nextexample
{
    public static void main(String ars[])
    {
        sample ob=new sample();
    }
}