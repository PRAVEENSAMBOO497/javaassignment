import java .util.*;
public class addallvector
   {
      public static void main(String arg[])
      {
        ArrayList<Integer> arraylist1= new ArrayList<Integer>(4);
          
        arraylist1.add(12);
        arraylist1.add(29);
        arraylist1.add(17);
           
         System.out.println("print array1" + arraylist1);

       ArrayList <Integer> sample2 = new ArrayList <Integer>(3);
          
       sample2.add(12);
       sample2.add(13);

          System.out.println("anything" + sample2);

          sample2.addAll(arraylist1);
           System.out.println( "Final answer is " +arraylist1);
      }
   }
