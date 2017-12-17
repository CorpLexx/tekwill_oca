package practice_Interface.bubleSortAdvance;

import java.util.*;

public class ArrayListTest {
    private static List<String> months;
    public static void main(String[] args) {
        months = new ArrayList<>();
        Random r = new Random();
        int[] newArray = new int[10000];
        for(int i = 0; i < 10000; i++){
            newArray[i] = r.nextInt();
        }

        BubleSort bubleSort = new BubleSort();
        bubleSort.intArray = newArray;


        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < newArray.length; i++){
            arrList.add(bubleSort.intArray[i]);
        }

        long startSort = System.currentTimeMillis();
        Collections.sort(arrList);
        long FinisSort = System.currentTimeMillis();


        long startBuble = System.currentTimeMillis();
        bubleSort.sort(bubleSort.intArray);
        long FinisBuble = System.currentTimeMillis();

        System.out.println("Sortare SORT: " + (FinisSort - startSort));
        System.out.println("Sortare BUBLE: " + (FinisBuble - startBuble));

        System.out.println(Arrays.toString(bubleSort.intArray));
    }
}