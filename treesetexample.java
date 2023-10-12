import java.util.*;
public class treesetexample 
   {
        public static void main(String args[])
        {  
          TreeSet<String> set=new TreeSet<String>();  
            set.add("Ravi");  
            set.add("Vijay");  
            set.add("Ajay");  
            set.add("ravi");
              System.out.println("Treeset remove duplicate elements and compare the string ");  
         Iterator i=set.descendingIterator();  
               while(i.hasNext())  
              {  
                 System.out.println(i.next());  
              }  
           
        }  
    }  

