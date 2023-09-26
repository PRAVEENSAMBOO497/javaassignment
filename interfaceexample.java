interface one 
    {
      public void getdata();
    }
interface two extends one
    {
      public void getdata1();
    }
class praveen 
{ 
  String name;
  int roll;
  praveen()
    {
        name="Muthu";
        roll =2;
    }
    
}
class praveen1 extends praveen implements two
{
        String city;
        int pincode; 

        praveen1()
        {
            city="Salem";
            pincode = 636011;

        }
        @Override
        public void getdata()
        {
            System.out.println("student name" + name);
            System.out.println("student roll" +roll);
        }
        public void getdata1()
        {
            System.out.println("city name" + city);
            System.out.println("pincode" + pincode);
        }

}
class interfaceexample   
{
    public static void main(String afg[])
     {
        praveen1 obj = new praveen1();
        obj.getdata();
        obj.getdata1();
     }
}