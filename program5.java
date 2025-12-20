import java.util.Scanner;

public class program5
{
      public static void main(String[]args)
      {
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Your Name:");
          String Name = sc.nextLine();

          if(Name.length()<3 || Name.length()>15)
          {
            System.out.println("Name Should Be Atleast 3 Characters Orr 15 characters");
            return;
          }

          System.out.println("Name Is Coreect:"+Name);

          System.out.println("Enter your password:");
          String password= sc.nextLine();

          if(password.length()<8)
          {
            System.out.println("Password Must Atleast 8 character");
            return;
          }

          System.out.println("Password Is Correct:"+password);

          if(Name.equals("Ram") && password.equals("soham1112") )
          {
            System.out.println("Login Sucessful");
          }
          else
          {
            System.out.println("Login falied");
          }

          
          




      }
}                             