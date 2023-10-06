import java.util.Scanner;

 class hasboolean {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a boolean value (true or false): ");
        
        
        String userInput = scanner.next();
        
        
        boolean isTrue = Boolean.parseBoolean(userInput);
        
        if (isTrue)
         {
            System.out.println("You entered true.");
        }
         else 
        {
            System.out.println("You entered false.");
        }
        
        
        scanner.close();
    }
}

