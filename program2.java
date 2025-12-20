import java.util.Scanner;
public class program2
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first num :");
        int num1 = sc.nextInt();

        System.out.println("Enter your second number:");
        int num2 = sc.nextInt(); 

        int result = num1 + num2;

        System.out.println(result);
    }
}