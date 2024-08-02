package de.example.insertionSort;

import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 5, 8, 7, 1, 9, 2, 6};
        int[] arrayB = insertionSort(array);

        for (int i : arrayB) {
            System.out.print(i + " ");
        }
    }

    public static int[] insertionSort(int[] array) {
        int length = array.length;
        int[] newArray = new int[length];
        newArray[0] = array[0];
        for (int i = 1; i < length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < newArray[j]) {
                newArray[j + 1] = newArray[j];
                j--;
            }
            newArray[j + 1] = key;
        }
        return newArray;
    }
}
