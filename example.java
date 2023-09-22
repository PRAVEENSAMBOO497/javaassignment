class sample
 {
    sample()	
	{
	
	}

   public void getdata(int x,int y)	
	{
	   int sum=x+y;
	   System.out.println("Addition="+sum);
	}
  }


class example
 {
    public static void main(String[] s)
	{
	   sample obj=new sample();
	   obj.getdata(31,12);	
	}
 }
