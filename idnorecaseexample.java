 class idnorecaseexample 
  {
     public static void main(String ard[])
     {
        String s1="SURAJ";
        String s2="suraj";
        String s3="PRAVEEN";
        String s4="praveen";
        
         System.out.println(s1.equalsIgnoreCase(s2));
         System.out.println(s2.compareToIgnoreCase(s4));
           System.out.println("Everything ok");
     }
  }
