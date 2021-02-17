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
            System.out.println("Last name is valid");
        else
            System.out.println("invalid");
    }
}

