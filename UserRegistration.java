import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    //method to check name is valid or not
        public static boolean nameValid(String name) {
        String regx = "^[A-Z][a-zA-Z]{3,}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
    //email validation
    public static boolean emailValid(String email){
        String regx = "^abc[a-zA-Z0-9.]*@bl[.]co[.][a-z]{2,3}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    // phone validation
    public static boolean phoneValid(String phoneNumber){
        String regx = "^[0-9]{2}[: :][0-9]{10}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    //rule3-min 8 char & atleast 1 upper case char and 1 number and exactly 1 special char
    public static boolean passwordValid(String password){
        String regx = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()]).{8,}$";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    //method to validate the given email samples
    public static boolean emailSampleValid(String email){
        String regx = "^abc[a-zA-Z0-9.+-]*@[a-z]*[.][a-z]{2,5}[.,a-z]{0,5}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter first Name : ");
        String firstName = scan.nextLine();
        if(nameValid(firstName))
            System.out.println("First name is valid");
        else
            System.out.println("invalid");

        System.out.println("Enter last  Name: ");
        String lastName = scan.nextLine();
        if(nameValid(lastName))
            System.out.println("last name is valid");
        else
            System.out.println("invalid");

        System.out.println("Enter your email :");
        String email = scan.nextLine();
        if(emailValid(email))
            System.out.println("email is correct");
        else
            System.out.println("invalid");

        System.out.println("Enter your phone number :");
        String phone = scan.nextLine();
        if(phoneValid(phone))
            System.out.println("phone number is correct");
        else
            System.out.println("invalid");

        System.out.println("Enter your password :");
        String password = scan.nextLine();
        if(passwordValid(password))
            System.out.println("password is correct");
        else
            System.out.println("invalid");
    }
}

