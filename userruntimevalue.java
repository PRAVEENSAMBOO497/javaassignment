import java.io.*;
class sample
{
    DataInputStream obj = new DataInputStream(System.in);
    sample()
    {
        try
        {
            int x=Integer.valueOf(obj.readLine()).intValue();
            int y=Integer.valueOf(obj.readLine()).intValue();
            int sum=x+y;
            System.out.println("answer is=" +sum); 
             }
             catch(Exception s)
             {}
    }
}
class userruntimevalue
{
    public static void main(String sg[])
    {
        sample obj = new sample();
    }
}
