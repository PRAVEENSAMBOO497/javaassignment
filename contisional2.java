class sample
{
    sample(String name1,String name2,String name3)
    {
        System.out.println("Hi user ;Enter your name😀"); 
                
        if(name1==name1)
        {
            System.out.println("The name is Praveen");
        }
         else if (name2==name2)
        {
            System.out.println("The name is Suraj");
        }
        else if (name3==name3)
        {
            System.out.println("The name is Hariprasanth");
        }
        else
        {
            System.out.println("The name is not there");
        }
    }
}
class contisional2
{
    public static void main (String arg[])
    {
        sample obj = new sample("Praveen","Suraj","Hariprasanth");
    }
} 