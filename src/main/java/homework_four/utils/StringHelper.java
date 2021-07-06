package homework_four.utils;

import homework_four.exceptions.StringFormatException;

public class StringHelper {
    public String addString(String srt, char[] charArray) throws StringFormatException {
        String string;

        if (charArray == null) {
            throw new NullPointerException("Char array is null");
        }
        string = String.valueOf(charArray);

        if (srt.trim().isEmpty() || string.trim().isEmpty()) {
            throw new StringFormatException("String is empty");
        }

        string = srt.trim().toUpperCase() + " " + string.trim().toLowerCase();

        if (string.length() % 2 != 0) {
            string = string.substring(0, string.length() / 2) + string.substring(string.length() / 2 + 1);
        } else {
            string = string.substring(0, string.length() / 2 - 1) + string.substring(string.length() / 2 + 1);
        }

        System.out.println("String length after changes : " + string.length());

        return string;
    }
}
