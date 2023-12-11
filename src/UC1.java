import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC1 {

    public void firstName(String str) {
        int flag = 0;
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3}$");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            flag = 1;
        }
        if (flag == 1) {
            System.out.println("Valid First Name");
        } else {
            System.out.println("Invalid First Name");
        }
    }
}
