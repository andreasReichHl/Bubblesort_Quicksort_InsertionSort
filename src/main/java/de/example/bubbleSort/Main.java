package de.example.bubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] array = randomNumberArray(200);
        long startTime = System.nanoTime();
        bubbleSort(array);
        long endTime = System.nanoTime();

        for(int i: array){
            System.out.println(i);
        }
        System.out.println("Sortieren des Arrays hat " + (endTime-startTime) + " ms gedauert.");

    }

    public static int[] randomNumberArray(int count){
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*2345);
        }
        return array;
    }

    public static void bubbleSort(int[] array){
        int length = array.length;
         for(int i = 0; i < length-1; i++){
             for (int j = 0; j < length-i-1; j++) {
                 if(array[j] > array[j+1]){
                     int temp = array[j];
                     array[j] = array[j+1];
                     array[j+1] = temp;
                 }
             }
         }
    }
}