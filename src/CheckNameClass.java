import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNameClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
//            ^[C,B,P]{1}[0-9]{4}[G-M]{1}
//            ^[(][0-9]{2}[)-]{1}[(][0]{1}[0-9]{9}[)]
            System.out.println("Enter name class:");
            String nameClass = sc.nextLine();
            Pattern p = Pattern.compile("^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]");
            Matcher m = p.matcher(nameClass.trim());
            if(m.matches()){
                System.out.println("ok");
                break;
            }
            else {
                System.out.println(" not !");

            }
        }
    }
}
