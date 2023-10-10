import java.util.*;
public class addelements 
   {
     public static void main(String arg[])
        {
        Vector <String> vc= new Vector<String>(10, 0);

          vc.add("a");
          vc.add("p");
          vc.add("r");
          vc.add("a");
          vc.add("ve");
           vc.addElement("Hari");  
          System.out.println("Elements");
           vc.addElement("Praveen");
            
            for(String str:vc) 
            {
                
              
                    System.out.println("Element= " +str); 
            

       }
    }
}
