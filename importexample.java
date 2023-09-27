import java.io.*;
class userlogin
  {
    DataInputStream obj = new DataInputStream(System.in);

   userlogin()
    {
        try 
           {
       System.out.println("enter the user name ");
       obj.readLine();
       System.out.println("enter the password");
       obj.readLine();
       System.out.println("user name and password are got it");
       obj.readLine();
            }
        catch (Exception e) {
        
       }
    }
  }
  class importexample
  {
      public static void main(String arg[])
    {
    userlogin obj = new userlogin();
    }
  }  