import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Craw {
    public static void main(String[] args) throws IOException {
      URL url = new URL("https://app.slack.com/client/T4AQ8L79A/C039M6GFH5W/thread/C039M6GFH5W-1654137972.425359");
        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\Z");
        String content = scanner.next();
//        System.out.println(content);
//        data-stringify-text="(.*?)"
        scanner.close();
        Pattern p = Pattern.compile("data-stringify-text=\"(.*?)\">");
        Matcher m = p.matcher(content);
        while (m.find()) {
            System.out.println(m.group(1));
        }
    }
}
