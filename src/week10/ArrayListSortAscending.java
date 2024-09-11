package week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSortAscending {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Cydeo", "B25", "Java", "Selenium"));

        list.add("Aaron");

        sortingArrayAsc(list);
        sortingArraysDesc(list);
        sortAscendingSt(list);
    }

    public static void sortingArrayAsc(ArrayList<String> arr) {

        String[] array = new String[arr.size()];
        array = arr.toArray(array);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void sortingArraysDesc(ArrayList<String> arr) {
        String[] array = new String[arr.size()];
        array = arr.toArray(array);
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));

    }

    public static void sortAscendingSt(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    // Swap elements if they are in the wrong order
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
}

