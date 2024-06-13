package Hokim.Week4;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));

    }
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static String removeDup(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(!(result.contains(str.substring(i,i+1)))){
                result += str.substring(i,i+1);
            }
        }

        return result;
    }




}
