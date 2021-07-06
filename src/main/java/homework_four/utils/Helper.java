package homework_four.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {
    public void phoneNumber(String stringA) {
        Pattern pattern = Pattern.compile("^(\\+380)[0-9]{9}$");
        Matcher matcher = pattern.matcher(stringA);

        System.out.println("Valid phone UA-format: " + matcher.matches());
    }

    public void mail(String stringB) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]" + "+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(stringB);

        System.out.println("Valid email: " + matcher.matches());
    }

    public void dateBirthday(String stringC) {
        Pattern pattern = Pattern.compile("^((19|20)\\d\\d)-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$");
        Matcher matcher = pattern.matcher(stringC);

        System.out.println("Valid date: " + matcher.matches());
    }
}
