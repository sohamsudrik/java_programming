public class program15
{
      public static void main(String[]args)
      {
            double balance = 1000.00;
            double withdrawAmount = 500.00;
            int pin = 1212;

            if(pin==1212)
            {
                  if(withdrawAmount<=balance)
                  {
                        balance -= withdrawAmount;

                        System.out.println("withdraw sucess...\n Reamming balance:"+balance);
                  }
                  else
                  {
                        System.out.println("Insufficient balance");
                  }
            }
            else
            {
                  System.out.println("Incorrect pin");
            }
      }
}