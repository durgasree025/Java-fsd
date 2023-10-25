import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexExpressions {
    public static void main(String[] args) {
         // Validating email addresses
        String[] emails = {"durga@gmail.com", "mani@gmail.com", "sohpiea@gmail.com"};

        System.out.println("Example 1: Validating email addresses");
        for (String email : emails) {
            boolean isValid = validateEmail(email);
            System.out.println(email + " is valid: " + isValid);
        }

        // Extracting phone numbers from a text
        String text = "Please contact us at +1-425-333-8888 for assistance.";

        System.out.println("Extracting phone numbers from a text");
        extractPhoneNumbers(text);
    }

    public static boolean validateEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void extractPhoneNumbers(String text) {
        String regex = "\\+\\d{1,3}-\\d{3}-\\d{3}-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Phone number: " + matcher.group());
        }
    }
}
