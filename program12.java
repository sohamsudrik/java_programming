public class program12
{
      public static void main(String[] args) {
          {
            if(10<20)
            {
                  System.out.println("Outer if");
                  if(100>50)
                  {
                        System.out.println("Inner if");
                  }
                  else
                  {
                        System.out.println("Inner else");
                  }
            }
            else
            {
                  System.out.println("Outer else");
            }
          }
      }
}