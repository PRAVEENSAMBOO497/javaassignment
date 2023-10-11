import java .util.*;
class quenceexample  
  {
     public static void main(String ar[])
     {
        Queue <Integer> queue = new LinkedList();
         {
            queue.add(12);
            queue.add(19);
              
              System.out.println("The passing values" + queue);

              queue.poll();
              System.out.println(queue);
             // queue.size();
              //System.out.println(1);
         }
     }
  }
