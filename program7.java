import java.util.Scanner;
public class program7
{
      public static void main(String[] args) 
      {
           Scanner sc = new Scanner(System.in);

           System.out.println("Enter username: ");
           String username = sc.nextLine();

           System.out.println("Enter password:");
           String password = sc.nextLine();

           if(username.equals("sohamsudrik") && password.equals("1212"))
           {
                System.out.println("login sucessful");
           }
           else
           {
              System.out.println("login failed");
           }

           
      }
          
      
}