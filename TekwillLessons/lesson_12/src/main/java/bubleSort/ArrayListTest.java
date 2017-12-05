package bubleSort.bubleSort;

import java.util.*;

public class ArrayListTest {
    private static List<String> months;
    public static void main(String[] args) {
        months = new ArrayList<>();

        BubleSort bubleSort = new BubleSort();
        int[] newArray = {3, 2, 1, 4, 2, 6, 9, 1 ,3, 3};
        bubleSort.intArray = newArray;
        bubleSort.sort(bubleSort.intArray);
        System.out.println(Arrays.toString(bubleSort.intArray));



    }
}
