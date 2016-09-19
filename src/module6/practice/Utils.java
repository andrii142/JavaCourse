package module6.practice;

import java.util.Arrays;

/**
 * Created by zetokz on 19.09.16.
 */
public abstract class Utils {


    public static String removeChar(char letter, String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != letter) {
//                result = result + text.charAt(i);
                result += text.charAt(i);
            }
        }
        return result;
    }

    public static String removeChar2(char letter, String text) {
        String result = "";
        char[] chars = text.toCharArray();
        for (char c : chars) {
            if (c != letter) {
                result += c;
            }
        }
        return result;
    }

    public static String removeChar3(char letter, String text) {
        String result = "";
        String[] chars = text.split(letter + "");
        for (String aChar : chars) {
            result += aChar;
        }
        return result;
    }

    public static String removeChar4(char letter, String text) {
        return text.replaceAll(letter + "", "");
    }

//    public static void doSomething() {
//        doSomething2();
//    }
//
//    private static void doSomething2() {
//
//    }

}
