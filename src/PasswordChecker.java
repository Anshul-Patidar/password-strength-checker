import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password:");

        String password = sc.nextLine();
        int score = 0;


        // Check length
        if (password.length() >= 8) score++;

        // Check uppercase
        if (password.matches(".*[A-Z].*")) score++;

        // Check lowercase
        if (password.matches(".*[a-z].*")) score++;

        // Check numbers
        if (password.matches(".*[0-9].*")) score++;

        // Check special characters
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) score++;

        // Print results
        System.out.println("\nPassword Strength Results:");
        System.out.println("---------------------------");
        System.out.println("Length ≥ 8: " + (password.length() >= 8));
        System.out.println("Has Uppercase: " + password.matches(".*[A-Z].*"));
        System.out.println("Has Lowercase: " + password.matches(".*[a-z].*"));
        System.out.println("Has Number: " + password.matches(".*[0-9].*"));
        System.out.println("Has Special Char: " + password.matches(".*[!@#$%^&*(),.?\":{}|<>].*"));



        System.out.println("\nSuggestions to improve your password:");
        if (password.length() < 8) {
        System.out.println("- Make it at least 8 characters long");
    }
    if (!password.matches(".*[A-Z].*")) {
    System.out.println("- Add at least one uppercase letter");
    }
    if (!password.matches(".*[a-z].*")) {
    System.out.println("- Add at least one lowercase letter");
    }
    if (!password.matches(".*[0-9].*")) {
    System.out.println("- Add at least one number");
    }
    if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
    System.out.println("- Add at least one special character (!@#$...)");
    }


        System.out.println("\nFinal Strength: ");
        if (score <= 2) {
            System.out.println("❌ Weak");
        } else if (score == 3 || score == 4) {
            System.out.println("⚠ Medium");
        } else {
            System.out.println("✅ Strong");
        }

        
    sc.close();
    }  
}
