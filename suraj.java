import pack.pack2;
class pack1 extends pack2
{
    String city;
    int roll;
 pack1(String name,String city,int age,int roll )
  {
     super(name,age);
      this.city=city;
        this.roll=roll;
  }  


     public void displaypack1()
     {
        System.out.println("city"+city);
        System.out.println("roll"+roll);
     }

  }
class suraj
{
   public static void main (String aj[])
   {
      pack1 obj = new pack1("praveen","salem",22,2);
      obj.displaypack2();
      obj.displaypack1();
   }
}

