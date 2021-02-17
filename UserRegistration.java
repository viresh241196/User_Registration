import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean firstNameValid(String name) {
        String regx = "^[A-Z][a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(name);
        System.out.println(matcher);
        return matcher.matches();
    }

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter firstName : ");
        String firstName = scan.nextLine();
        System.out.println("First name :"+firstNameValid(firstName));
    }
}

