import java.util.*;
class pollexample 
   {
    public static void main( String args[] ) 
      {
      LinkedList<String> list = new LinkedList<>();
      list.add("1");
      list.add("2");
      list.add("3");
      System.out.println("The list is " + list);
      
      System.out.println("list.poll() returns : " + list.poll());
      System.out.println("The list is " + list);

      }
   }
