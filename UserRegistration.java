import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    //method to check name is valid or not
    public static boolean nameValid(String name) {
        String regx = "^[A-Z][a-zA-Z]{2,}";
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
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter first Name : ");
        String firstName = scan.nextLine();
        if(nameValid(firstName))
            System.out.println("First name is valid");
        System.out.println("Enter last  Name: ");
        String lastName = scan.nextLine();
        if(nameValid(lastName))
            System.out.println("last name is valid");
        System.out.println("Enter your email :");
        String email = scan.nextLine();
        if(emailValid(email))
            System.out.println("email is correct");
        else
            System.out.println("invalid");
    }
}

