import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {

    
    private static final String PHONE_NUMBER_REGEX = "^\\+?91[0-9]\\d{9}$|^[0-9]\\d{9}$";

    public static boolean isValidIndianPhoneNumber(String phoneNumber) {

        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        
        Matcher matcher = pattern.matcher(phoneNumber);
        
        return matcher.matches();
    }

    public static void main(String[] args) {
       
        String[] phoneNumbers = {"+91 7339410810", "9876543210", "+919876543210", "1234567890","8738747CBAN"};

        for (String phoneNumber : phoneNumbers) {
           
            String sanitizedPhoneNumber = phoneNumber.replaceAll("\\s+", "");
            if (isValidIndianPhoneNumber(sanitizedPhoneNumber)) {
                System.out.println(phoneNumber + " is a valid Indian phone number.");
            } else {
                System.out.println(phoneNumber + " is not a valid Indian phone number.");
            }
        }
    }
}
