import java.util.Scanner;
public class program10
{
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your price:");
        double price = sc.nextDouble();

        if(price > 10000)
        {
            System.out.println("20%");
            double discount = price * 0.20;
            double finalAmount = price - discount;
            System.out.println("Final Amount: " + finalAmount);
        }
        else if(price > 5000 && price < 7000)
        {
            System.out.println("15%");
            double discount = price * 0.15;
            double finalAmount = price - discount;
            System.out.println("Final Amount: " + finalAmount);
        }
        else if(price > 3000 && price < 5000)
        {
            System.out.println("10%");
            double discount = price * 0.10;
            double finalAmount = price - discount;
            System.out.println("Final Amount: " + finalAmount);
        }
        else
        {
            System.out.println("No Discount");
        }

        sc.close();
    }
}