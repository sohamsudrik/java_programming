public class program9
{
      public static void main(String[] args) {
          
          String username = "Ram";
          String password = "1212";

          if(username.equals("Ram") && password.equals("1212"))
          {
            System.out.println("Login Succesful");
          }
          else if (!(username.equals("Ram")))
          {
            System.out.println("Username is not correct");
          }
          else if(!(password.equals("1212")))
          {
            System.out.println("password is not coorect");
          }
          else if(!(username.equals("Ram")) && !(password.equals("1212")))
          {
            System.out.println("username and password is not correct");
          }
      }
}