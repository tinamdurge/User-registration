
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC4 {
    public void validate(String str) {
        int flag = 0;
        Pattern pattern = Pattern.compile("^(\\+?\\d{1,2}?)?(\\d{10})$");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            flag = 1;
        }
        if (flag == 1) {
            System.out.println("valid phone number");
        } else {
            System.out.println("invalid phone number");
        }

    }
}
