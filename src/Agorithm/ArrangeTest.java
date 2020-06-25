package Agorithm;

import java.util.Arrays;

public class ArrangeTest {

    private static final int [] NUMBERS = {50, 23, 9, 18, 61, 32};

    private static void bubbleSort(int[] array){
        for(int i=0;i < array.length - 1 ; i++){
            for(int j =0; j < array.length - 1 -i; j++){
                if(array[j] > array [j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void selectSort(int[] array){
        for(int i = 0; i < array.length -1 ; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void _quicksort(int[] numbers,int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(numbers,i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            _quicksort(numbers,low, j);
        if (i < high)
            _quicksort(numbers, i, high);
    }


    private static void exchange(int[] numbers,int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    private static void quickSort(int[] numbers){
       _quicksort(numbers,0, numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        quickSort(NUMBERS);
    }
    
}
