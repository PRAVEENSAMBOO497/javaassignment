import java .util.Scanner;
class stringcomparison
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the fist place");
        String str1=sc.nextLine();
        System.out.println("Enter the second place");
        String str2=sc.nextLine();
        if(str1.equals(str2))
        {
            System.out.println("The first place name is salem ");
        }
        else if(!str1.equals(str2))
        {
            System.out.println("The second palce is cheenai");
        }
    }
}