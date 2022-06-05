package Account;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawNews {
    public static void main(String[] args) throws IOException {
       URL url = new URL("https://dantri.com.vn/the-gioi.htm");
        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\Z");
        String content = scanner.next();
//      System.out.println(content);
//        data-stringify-text="(.*?)"
        scanner.close();

        Pattern p = Pattern.compile("class\\=\"article-title\"> <a href\\=\"(.*?)\">(.*?)</a>");
        Matcher m = p.matcher(content);
        while (m.find()) {
            System.out.println(m.group(1)+""+m.group(2));
        }
    }
}
