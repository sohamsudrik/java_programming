import java.util.Scanner;
public class program19
{
      public static void main(String[] args) {
          {

              Scanner sc = new Scanner(System.in);

              int num = -1;
              while(num<0)
              {
                  System.out.println("Enter any number:");
                  num = sc.nextInt();

                  if(num>0)
                  {
                        System.out.println("Good postive number");
                  }
                  else
                  {
                        System.out.println("Enter postive number only");
                  }
              }


          }
      }
}