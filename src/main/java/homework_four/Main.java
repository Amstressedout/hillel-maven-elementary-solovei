package homework_four;

import homework_four.exceptions.StringFormatException;
import homework_four.utils.Helper;
import homework_four.utils.StringHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringHelper stringHelper = new StringHelper();
        Helper helper = new Helper();
        Scanner scanner = new Scanner(System.in);

        String string = "L O L O L O L O L";
        char[] charArray = {10, 100, 200, 20};

        try {
            System.out.println(stringHelper.addString(string, charArray));
        } catch (StringFormatException e) {
            e.printStackTrace();
        }

        System.out.println("Please enter Ukrainian phone number: ");
        helper.phoneNumber(scanner.nextLine());

        System.out.println("Please enter Mail: ");
        helper.mail(scanner.nextLine());

        System.out.println("Please enter date birthday: ");
        helper.dateBirthday(scanner.nextLine());
    }
}
