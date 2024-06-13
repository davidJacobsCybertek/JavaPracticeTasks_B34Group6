package Hokim.Week4;

public class FrequencyofCharacters {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
    }
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
    public static String frequencyOfChars(String str){
        String result = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
               if (str.charAt(i) == str.charAt(j)){
                   count++;
               }
            }
            if (!(result.contains(str.substring(i,i+1)))) {
                result += str.substring(i, i + 1);
                result += count;
            }
            count = 0;
        }
        return result;
    }
}
