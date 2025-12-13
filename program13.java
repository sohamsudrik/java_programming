import java.util.Scanner;
public class program13
{
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your age:");
            int age = sc.nextInt();

            if(age>18 && age<=25)
            {
                  System.out.println("Eligible for admission");

                  System.out.println("\n Enter your CET mark:");
                  int mark = sc.nextInt();

                  if(mark>95)
                  {
                        System.out.println("Addimssion success");
                  }
                  else if(mark<95 && mark>70)
                  {
                        System.out.println("You need pay 2 lakh");
                  }
                  else if(mark<70 && mark>50)
                  {
                        System.out.println("You need pay 5 lakh");
                  }
                  else if(mark<50 && mark>30)
                  {
                        System.out.println("you need pay 8 lakh");
                  }
                  else 
                  {
                        System.out.println("Try again next year");
                  }
            }
            else
            {
                  System.out.println("Age is not eligible for addimission ");
            }

      } 
}