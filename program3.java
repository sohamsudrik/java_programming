      import java.util.Scanner;
public class program3
{
      public static void main(String[]args)
      {
            
            String student_name;
            double student_mark;
            char   student_grade;
            String Student_address;
            long student_number;
            int student_age;
            long parent_number;
            

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter student name:");
            student_name = sc.nextLine();

            System.out.println("Enter your mark:");
            student_mark = sc.nextDouble();

            System.out.println("Enter your grade:");
            student_grade = sc.next().charAt(0);

            System.out.println("Enter your number:");
            student_number = sc.nextLong();

            System.out.println("Enter your age:");
            student_age = sc.nextInt();

            System.out.println("Enter your parent number:");
            parent_number = sc.nextLong();

            System.out.println("Student Details....");

            System.out.println("Student Name:"+student_name);
            System.out.println("Student Mark:"+student_mark);
            System.out.println("Student Grade:"+student_grade);
            System.out.println("Student Number:"+student_number);
            System.out.println("Student Age:"+student_age);
            System.out.println("Student Parent Number:"+parent_number);










      }
}