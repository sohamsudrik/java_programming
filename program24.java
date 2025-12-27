import java.util.Scanner;
public class program24
{
      public static void main(String[] args) {
          {
            int Choice = 0;


            Scanner sc = new Scanner(System.in);

            System.out.println("Enter The Number To Print The Star Patterns");
            Choice = sc.nextInt();

            

            switch(Choice)
            {
                  case 5 : 
                  for(int i =1 ; i<=5 ; i++)
                  {
                        for(int j=1 ; j<=5 ; j++)
                        {
                              System.out.print("*");
                        }

                        System.out.println();
                  }
                  break;

                  case 10 : 
                  for(int i =1; i<=10 ; i++)
                  {
                        for(int j=1 ; j<=10 ; j++)
                        {
                              System.out.print("*");
                        }

                        System.out.println();
                  }
                  break;

                  case 15 : 
                  for(int i =1; i<=15 ; i++)
                  {
                        for(int j=1 ; j<=15 ; j++)
                        {
                              System.out.print("*");
                        }

                        System.out.println();
                  }
                  break;

                  case 20 : 
                  for(int i =1 ; i<=20 ; i++)
                  {
                        for(int j=1 ; j<=20 ; j++)
                        {
                              System.out.print("*");
                        }

                        System.out.println();
                  }
                  break;

                  default :
                  {
                        System.out.println("Invalid Choice");
                  }

            }



          }
      }
}