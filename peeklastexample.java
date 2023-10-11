import java.util.*;
//import java.util.LinkedList;

class peeklostexample
{
   public static void main(String[] args) 
    {

      
      LinkedList list = new LinkedList<>();

      // add some elements
      list.add("Hello");
      list.add(2);
      list.add("Chocolate");
      list.add("10");

      
      System.out.println("LinkedList:" + list);

    
      System.out.println("element of the last:" + list.peekLast());

   }
}