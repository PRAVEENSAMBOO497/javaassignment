
import java.util.*;
public class addlist{

	public static void main(String[] args)
	{
	
		LinkedList<String> list = new LinkedList<String>();


		list.add("Geeks");
		list.add("4");
		list.add("Geeks");
		list.add("8");
        //list.remove("Geeks");
        list.addFirst("praveen");
		
		System.out.println("The elements in List are : "+ list);
						

		
		System.out.println("Element at 1st index is : "+ list.getFirst());
						
	}
}

