import java.util.LinkedList;
class peekexample
    {
    public static void main( String args[] ) 
     {
         LinkedList<String> list = new LinkedList<>();
         list.add("1");
         list.add("2");
         list.add("3");
       
          System.out.println("The list is " + list);
      
          System.out.println("The peek element of the list is " + list.peek());
     }
}
