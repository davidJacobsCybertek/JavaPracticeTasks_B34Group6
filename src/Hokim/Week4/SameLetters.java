package Hokim.Week4;

public class SameLetters {

    public static void main(String[] args) {
        System.out.println(isSame("abc", "bca"));

    }
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/

    public static boolean isSame(String str1, String str2) {
        String temp = "";

        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        temp += str1.charAt(i);
                    }
                }
            }
        }

        if (temp.equals(str1)) {
            return true;
        }

        return false;
    }
}
