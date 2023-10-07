 class equalsexample
  {
    equalsexample()
    {
        String s1="Hari";
        String s2="Praveen";
        String s3="Praveen";
        String s4="Hari";

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s2.equals(s3));


        }
    
  }  
  class sample 
  {
    public static void main(String ard[])
    {
        equalsexample obt=new equalsexample();
    }
  }
