import java.util.Scanner;
public class program6
{
      public static void main(String[]args)
      {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter product price:");
            Double price = sc.nextDouble();

            if(price>10000)
            {
                  System.out.println("You will get 20% discount");
            }
            if(price>5000 && price<10000)
            {
                  System.out.println("You will get 10% discount");
            }
            if(price>2000 && price<5000)
            {
                  System.out.println("you will get 5% discount");
            }
            if(price<2000)
            {
                  System.out.println("No Discount");
            }


      }
}