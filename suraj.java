package package1;

public class suraj extends praveen
  {
     String city;
     int roll;
     
    public suraj(String name,int age,String city,int roll)
     { 
       super(name,age); 
       this.city =city;
       this.roll=roll; 
     }
     public void displaysuraj()
     {
         System.out.println("enter the city " +city);
         System.out.println("enter the roll"+roll);
     }

 }
 class hari
 {
    public static void main(String args[])
    {
        suraj obj=new suraj("ram",21,"salem",2);
        obj.displaypraveen();
        obj.displaysuraj();
    }
 }
 
 
    
  