import java.util.Scanner;
public class program22
{
      public static void main(String[] args) {
          {
            int i =1;
            Scanner sc = new Scanner(System.in);
            double Balance = 1000.00;
            String WantToCantinue;

            // ---------- HEADER ----------
        System.out.println("=================================");
        System.out.println("        WELCOME TO SBI BANK       ");
        System.out.println("=================================");

            do { 
                  System.out.println("Welcome To SBI Bank...");

                  System.out.println("1:Deposite");
                  System.out.println("2.Withdraw");
                  System.out.println("3.Check Balance");
                  System.out.println("4: Exit");

                  System.out.println("Enter Your Choice:");
                  int Choice = sc.nextInt();

                  if(Choice==1)
                  {
                        System.out.println("Enter Your Deposite Amount:");
                        int Amount = sc.nextInt();

                        if(Amount>0)
                        {
                              Balance+=Amount;
                              System.out.println("Deposite Sucessfull... After Deposite Balance:"+Balance);
                        }
                        else
                        {
                            System.out.println("Invalid Amount...");  
                        }
                  }
                  else if(Choice==2)
                  {
                        System.out.println("Enter Your Withdraw Amount:");
                        int Amount = sc.nextInt();

                        if(Amount>0)
                        {
                              if(Amount<=Balance)
                              {
                                Balance-=Amount;
                                System.out.println("Withdraw Sucessfull... After Withdraw Balance :"+Balance ); 
                              }
                              else
                              {
                                    System.out.println("Insufficient Balance...");
                              }
                                
                        }
                        else
                        {
                              System.out.println("Invaild Amount...");
                        }
                  }
                  else if(Choice==3)
                  {
                        System.out.println("Your Current Balance is:"+Balance);
                  }
                  else if(Choice==4)
                  {
                        System.out.println("Thank You For Using SBI Bank ATM");
                        break;
                  }
                  else
                  {
                        System.out.println("Invalid choice");
                  }

                  System.out.println("Do You Want Contiune?(Yes/No)");
                  WantToCantinue = sc.next();

                  if(WantToCantinue.equals("No"))
                  {
                        System.out.println("Thank You Using SBI Bank...");
                        break;
                  }

                
            } while (WantToCantinue.equals("Yes"));

            // ---------- FOOTER ----------
        System.out.println("=================================");
        System.out.println("   THANK YOU FOR BANKING WITH US  ");
        System.out.println("        VISIT AGAIN 😊           ");
        System.out.println("=================================");

          }
      }
}