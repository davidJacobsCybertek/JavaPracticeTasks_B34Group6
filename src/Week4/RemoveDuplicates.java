package Week4;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/
    public static void main(String[] args) {

        String input = "AAABBBCCC";

        String output = "";

        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index % input.length()) != input
                    .charAt((index + 1) % input.length())) {

                output += input.charAt(index);

            }
        }
        System.out.println(output);
    }

}
