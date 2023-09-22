abstract class sample
 {
    sample()
	{

	}

    public void getdata() // method definition
	{

	}
   abstract public void getdata1(int roll,String name );  // method declaration
 }

class sample1 extends sample
 {

   sample1()
	{

	}
    @Override
    public void getdata1(int x,String name)
	{
	 System.out.println("your name "+name+"\n your age"+x);
	

	}

 }

class abstrexample
 {
   public static void main(String asd[])
	{
	    sample1 obj=new sample1();
	    obj.getdata1(20,"praveen");
	}
 }