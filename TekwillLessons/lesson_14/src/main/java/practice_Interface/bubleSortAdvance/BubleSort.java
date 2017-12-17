package practice_Interface.bubleSortAdvance;

public class BubleSort {
    int[] intArray;

    public void sort(int[] newIntArray) {
        int temp;
        for (int i = 0; i < newIntArray.length-1; i++) {
            for (int j = 1; j < newIntArray.length - i; j++) {
                if (newIntArray[j-1] > newIntArray[j]) {
                    temp = newIntArray[j-1];
                    newIntArray[j-1] = newIntArray[j];
                    newIntArray[j] = temp;
                    // put return type in ArrayList
                    // compare bubleSort with Collection.sort();
                    // System.currentTimeMillis();
                }
            }
        }
    }
}
