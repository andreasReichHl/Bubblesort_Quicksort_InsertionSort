package de.example.quickSort;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 5, 8, 7, 1, 9, 2, 6};
        int[] arrayB = quickSortWirth(array, 0, array.length-1);

        for (int i : arrayB) {
            System.out.print(i + " ");
        }
    }
        public static int[] quickSortWirth(int[] arr, int l, int r) {
            int i, j, w, x;
            i = l;
            j = r;
            x = arr[(l + r) / 2];
            do {
                while (arr[i] < x)
                    i++;
                while (x < arr[j])
                    j--;
                if (i <= j) {
                    w = arr[i];
                    arr[i] = arr[j];
                    arr[j] = w;
                    i++;
                    j--;
                }
            } while (i <= j);
            if (l < j)
                quickSortWirth(arr, l, j);
            if (i < r)
                quickSortWirth(arr, i, r);
            return arr;
        }

}