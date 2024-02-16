import java.util.Scanner;

public class RwandanPhoneNumberValidator {
    private static final String RWANDAN_PHONE_REGEX = "(\\+2507|07)\\d{8}";

    public static String validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.matches(RWANDAN_PHONE_REGEX)) {
            if (phoneNumber.startsWith("07")) {
                return "Local number format";
            } else if (phoneNumber.startsWith("+2507")) {
                return "International number format";
            }
        }
        return "Invalid number format";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the phone number to validate:");
        String phoneNumber = scanner.nextLine();
        scanner.close();

        System.out.println("Validation Result: " + validatePhoneNumber(phoneNumber));
    }
}
