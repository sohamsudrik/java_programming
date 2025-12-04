import java.util.Scanner;

public class program4
{
    public static void main(String[] args)
    {

      
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String student_name = sc.nextLine();

        System.out.print("Enter your mark: ");
        double student_mark = sc.nextDouble();

        System.out.print("Enter your grade: ");
        char student_grade = sc.next().charAt(0);
        sc.nextLine(); // clear buffer

        System.out.print("Enter your address: ");
        String student_address = sc.nextLine();
        
        System.out.print("Enter your number: ");
        long student_number = sc.nextLong();
        
        System.out.print("Enter your age: ");
        int student_age = sc.nextInt();

        System.out.print("Enter your parent number: ");
        long parent_number = sc.nextLong();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + student_name);
        System.out.println("Mark: " + student_mark);
        System.out.println("Grade: " + student_grade);
        System.out.println("Address: " + student_address);
        System.out.println("Number: " + student_number);
        System.out.println("Age: " + student_age);
        System.out.println("Parent Number: " + parent_number);
    }
}
