import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4 {
    public static void main(String[] args) {
        String[] testStrings = {"1234", "aBcDeF", "abc123", "1a2b3c", "hello world"};
        
        // Pattern 1: Match any string of exactly 6 alphanumeric characters
        Pattern pattern1 = Pattern.compile("\\b\\w{6}\\b");
        System.out.println("Pattern 1: Match any string of exactly 6 alphanumeric characters");
        for (String str : testStrings) {
            Matcher matcher = pattern1.matcher(str);
            System.out.println(str + ": " + matcher.matches());
        }
        System.out.println();
        
        // Pattern 2: Match any string that starts with a capital letter and ends with a lowercase letter
        Pattern pattern2 = Pattern.compile("^[A-Z].*[a-z]$");
        System.out.println("Pattern 2: Match any string that starts with a capital letter and ends with a lowercase letter");
        for (String str : testStrings) {
            Matcher matcher = pattern2.matcher(str);
            System.out.println(str + ": " + matcher.matches());
        }
        System.out.println();
        
        // Pattern 3: Match any string that contains only letters
        Pattern pattern3 = Pattern.compile("[a-zA-Z]+");
        System.out.println("Pattern 3: Match any string that contains only letters");
        for (String str : testStrings) {
            Matcher matcher = pattern3.matcher(str);
            System.out.println(str + ": " + matcher.matches());
        }
        System.out.println();
        
        // Pattern 4: Match any string that starts with a digit and ends with a letter
        Pattern pattern4 = Pattern.compile("^\\d.*[a-zA-Z]$");
        System.out.println("Pattern 4: Match any string that starts with a digit and ends with a letter");
        for (String str : testStrings) {
            Matcher matcher = pattern4.matcher(str);
            System.out.println(str + ": " + matcher.matches());
        }
        System.out.println();
        
        // Pattern 5: Match any string that contains the substring "world"
        Pattern pattern5 = Pattern.compile(".*world.*");
        System.out.println("Pattern 5: Match any string that contains the substring \"world\"");
        for (String str : testStrings) {
            Matcher matcher = pattern5.matcher(str);
            System.out.println(str + ": " + matcher.matches());
        }
        System.out.println();
    }
}
