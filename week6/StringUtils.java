package week6;

import java.util.ArrayList;

public class StringUtils {
    public static boolean included(String word, String searched) {
        return word.toUpperCase().contains(searched.trim().toUpperCase());
    }
}
