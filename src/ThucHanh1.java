import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThucHanh1 {
    private static Pattern pattern;
    private Matcher matcher;
    private static ThucHanh1 emailExample;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public ThucHanh1() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validateEmail(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        emailExample = new ThucHanh1();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validateEmail(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validateEmail(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}



