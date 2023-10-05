class Stringmethod{
    public static void main(String[] args) 
    {
        
        StringBuffer buffer = new StringBuffer("Hello");

        
        buffer.append(" World");
        System.out.println("After appending: " + buffer.toString());


        buffer.insert(5, ", Java");
        System.out.println("After inserting: " + buffer.toString());

        
        buffer.delete(5, 10);
        System.out.println("After deleting: " + buffer.toString());

    
        buffer.replace(0, 5, "Hi");
        System.out.println("After replacing: " + buffer.toString());

    
        int length = buffer.length();
        System.out.println("Length of the StringBuffer: " + length);

        
        buffer.reverse();
        System.out.println("After reversing: " + buffer.toString());

        
        String sub1 = buffer.substring(0, 2);
        String sub2 = buffer.substring(3, 5);
        System.out.println("Substring 1: " + sub1);
        System.out.println("Substring 2: " + sub2);
    }
}
