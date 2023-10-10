import java.util.*;  
public class ensurecapsityex
 {    
    public static void main(String arg[])
    {   
                   
           Vector<Integer> vec = new Vector<>(100);         
             
           //vec.ensureCapacity(25);   
           vec.ensureCapacity(200);        
           
           System.out.println("Minimum capacity of this vector: " +vec.capacity());  
    }              
}  