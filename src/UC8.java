import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC8 {
    public void validate(String str) {
        int flag = 0;
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])([a-zA-Z0-9@$!%*#?&]){8,}$");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            flag = 1;
        }
        if (flag == 1) {
            System.out.println("valid password");
        } else {
            System.out.println("invalid password");
        }
    }
}