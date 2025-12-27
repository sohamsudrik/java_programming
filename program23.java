import java.util.Scanner;
public class program23
{
      //////////////////////////////////////////////////////////////////\
      ///
      ///CALCULATOR BY USING SWITCH CASE
      ///
      /////////////////////////////////////////////////////////////////////
      public static void main(String[] args)
      {
            int num1 = 0;
            int num2 = 0;
            char Choice ;

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter First Number:");
            num1 = sc.nextInt();

            System.out.println("Enter Second Number:");
            num2 = sc.nextInt();

            System.out.println("Enetr The Operator(+ - * / %)");
             Choice = sc.next().charAt(0);

            switch (Choice) 
            {

                  case '+' : System.out.println("Addtion Of Two Number Is:"+ (num1+num2));
                  break;

                  case '-' : System.out.println("Substraction Of Two Number Is:"+ (num1-num2));
                  break;

                  case '*' : System.out.println("Multiplication Of Two Number Is:"+(num1*num2));
                  break;

                  case '/' : System.out.println("Divsion Of Two Number Is:"+(num1/num2));
                  break;

                  case '%' : System.out.println("Modules Of Two Number Is:"+(num1/num2));
                  break;

                  default  :
                  {
                        System.out.println("Invalid Operator");
                  }

//////////////////////////////////////////////////////////////////////////////////////////////                  
///
///Input : num1 = 12 , num2 = 23
///Output : 12+23 = 31
///
///Input : num1 = 20 , num2 = 5
///Output : 20-5 = 15
///
///Intput: num1 = 6 , num2 = 6
///Output: 6*6 = 36
///
///Input : num1 = 50 , num2 = 5
///Output : num1/num2 = 10
///
///Input : num1 = 23 , num2 = 4
///Output : num1%num2 = 5
///
///////////////////////////////////////////////////////////////////////////////////////////////




                
            }

            




      }
}