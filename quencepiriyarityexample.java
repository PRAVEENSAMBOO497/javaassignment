import java.util.*;
class quencepiriyarityexample 
     {
        public static void main(String ar[])
        {
        PriorityQueue<String> queue=new PriorityQueue<String>();  

        queue.add("Suraj");
        queue.add("praveen");
        queue.add("Hari");
          
           System.out.println("all elements" + queue);
           Iterator itr=queue.iterator();
           while(itr.hasNext()) 
           {
              System.out.println(itr.next());
           }

        }
    }