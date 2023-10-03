class train
{
    String name ;
    String destination;
    int cost;
    int time;
    
    train()
    {
       name ="Train";
       destination= "chennai";
       cost =300;
       time =2;
       this.dispalytrain();
    }
    public void dispalytrain()
     {
        System.out.println("Name"+name);
        System.out.println("destination"+destination);
        System.out.println("cost"+cost);
        System.out.println("time"+time);
     }
}
 class bus  extends train  
   {
     bus()
      {
        super();
       name = "bus";
       destination="salem";
       cost =450;
       time =2;
       
      }
      public static void displaybus()
      {
        System.out.println("Name"+name);
        System.out.println("destination"+destination);
        System.out.println("cost"+cost);
        System.out.println("time"+time);
      }
   }
   class airoplain extends bus
   {
    airoplain()
    {
        super();
        name="airoplain";
        destination= " atthur";
        cost=100;
        time=1;
        this.displayairoplain();
    }
    public void displayairoplain()
    {
        System.out.println("Name"+name);
        System.out.println("destination"+ destination);
        System.out.println("cost"+cost);
        System.out.println("time"+time);
    }

   }
class realtime
{
    public static void main(String ard[])
    {
        train obj =new train();
        bus ob= new bus();
        
    }
    
}
