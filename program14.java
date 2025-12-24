import java.util.Scanner;
public class program14
{
      public static void main(String[] args) {
          {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your location:");
            String location = sc.nextLine();

            if(location.equals("mumbai") || location.equals("pune"))
            {
                  System.out.println("Your location is match");

                  System.out.println("Enter your price:");
                  double price = sc.nextDouble();

                  if(price>2000)
                  {
                        System.out.println("No delivery charge");
                  }
                  else
                  {
                        System.out.println("50 Rs delivery charge");
                  }            
            }
            else
            {
                  System.out.println("your location is not match");
            }
            
          }
      }
}