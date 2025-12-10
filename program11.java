import java.util.Scanner;
public class program11
{
      public static void main(String[] args) {
          {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your marks:");
            int marks = sc.nextInt();;
            String grade;

            if(marks>90)
            {
                  grade=("your grade is A");
                  System.out.println(grade);

            } 
            else if(marks<90 && marks>70)
            {
                  grade = ("your grade is B");
                  System.out.println(grade);
            }
            else if (marks<70 && marks>50)
            {
                  grade = ("your grade is C");
                  System.out.println(grade);
            }
            else 
            {
                  System.out.println("Fail");
            }
          }
      }
}