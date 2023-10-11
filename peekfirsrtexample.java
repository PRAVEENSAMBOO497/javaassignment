import java.util.ArrayList;
import java.util.LinkedList;

class peekfirstexample
{
   public static void main(String[] args) 
    {

      
      LinkedList list = new LinkedList<>();

      
      list.add("Hello");
      list.add(2);
      list.add("Chocolate");
      list.add("10");

      
      System.out.println("LinkedList:" + list);

    
      System.out.println("First element of the list:" + list.peekFirst());

   }
}
