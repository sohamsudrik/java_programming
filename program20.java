import java.util.Scanner;
public class program20
{
      public static void main(String[]args)
      {
            Scanner sc = new Scanner(System.in);
            int number;

            do{
                  System.out.println("Enter any number:");
                  number = sc.nextInt();


            } while (number <= 0);

            

            System.out.println("you enter number:" +number);
      }
}