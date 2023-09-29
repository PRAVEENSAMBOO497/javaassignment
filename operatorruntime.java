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
            System.out.println(x<y);
            System.out.println(x<=y);
            System.out.println(x>y);
            System.out.println(x>=y);
            System.out.println(x!=y);
            System.out.println(x==y);
        }catch(Exception s)
        {

        }
    }

    }
    class operatorruntime
    {
        public static void main(String ah[])
        {
            sample obj = new sample();
        }
    }

