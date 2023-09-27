import java.io.DataInputStream;
class example
{

   DataInputStream obj = new DataInputStream(System.in);
   
   example()
   {
      try
      {
      System.out.println("enter the user name");
      obj.readLine();
      System.out.println("enter the father name of the user");
      obj.readLine();
      System.out.println("enter the value");
      int x=Integer.valueOf(obj.readLine()).intValue();
      int y=Integer.valueOf(obj.readLine()).intValue();
      }
      catch(Exception s)
      {}
   }

}
class uservalue
{
    public static void main(String au[])
    {
        example obj = new example();
    }
}