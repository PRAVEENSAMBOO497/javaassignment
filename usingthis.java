class employee
 {
    String name,designation;

    employee(String name,String designation)
	{
		 
	   this.name=name;
	   this.designation=designation;
    
	}

    public void displayemp()
	{
	  System.out.println(name);
	  System.out.println(designation);
      
	}
 }


class usingthis
 {
    public static void main(String asd[])
	{
	  employee emp1=new employee("Pravin","Software engineer" );
	  emp1.displayemp();
	}
 }