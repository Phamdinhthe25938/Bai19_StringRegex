package Account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };
    public Account(){

    }
    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        for (String account : validAccount) {
            boolean isvalid = Account.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = Account.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }
}
