
import pack.packexample;

class praveen extends packexample
 {
    String intr;
    int exp;
    praveen(String name,int age,String city,String intr,int exp)
	{
	   super(name,age,city);
	   this.intr=intr;
	   this.exp=exp;
	}

    public void displaypraveen()
	{
	   System.out.println("Training"+intr);
	   System.out.println("Experience"+exp+"weeks");  
	}
 }


class packexample1
 {
    public static void main(String asd[])
	{
	   praveen obj=new praveen("praveen",21,"Salem","software_engineer",2);
	   obj.displaypackexample();
	   obj.displaypraveen();
	}
 }
