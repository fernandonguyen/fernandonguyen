package C0520H1.Sort;

import java.util.Arrays;

public class Sort {

    static void bubble(int[] arr) {
        boolean nextPass = true;
        for(int i = 1; i < arr.length && nextPass; i++){
            nextPass = false;
            for(int j = 0; j < arr.length - i; j++){
                if (arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                    nextPass = true;
                }
            }
        }
    }

    static void insertion (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int k;
            for ( k = i - 1; k >= 0 && arr[k] > key; k--) {
                arr[k+1] = arr[k];
            }
            arr[k+1] = key;
        }
    }

   static void quick (int[] arr, int low, int high) {
       int partition = partition(arr,low,high);

       if (partition - 1 > low) {
           quick(arr, low, partition - 1);
       }

       if (partition + 1 < high) {
           quick(arr, partition -1 , high);
       }

   }

   static int partition (int[] arr, int low, int high) {
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                swap(arr,low, j);
                low++;
            }
        }
        swap(arr,low,high);
        return low;
   }

//   static int mergeSort(){
//
//   }

   static void noi_bot(int[] arr){
        boolean check = true;
        for (int i = 0; i < arr.length -1 && check; i++) {
            check = false;
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j + 1);
                    check = true;
                }
            }
        }
   }
    static void lua_chon(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            swap(arr,i,index);
        }
    }

    static void chen(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while ( j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

//    static void binarySearch(int[] arr, int left, int right, int key){
//        if (left > right){
//            System.out.println("Khong tin thay");
//            return;
//        }
//
//        if (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (arr[mid] > key) {
//                binarySearch(arr, left, mid -1, key);
//            } else if (arr[mid] < key) {
//                binarySearch(arr, mid + 1, right, key);
//            } else if (arr[mid] == key) {
//                System.out.println("Đa tim thay tai vi tri " + mid);
//                return;
//            }
//        }
//
//    }

//    static int binarySearch(int[] arr, int key){
//        int low = 0;
//        int high = arr.length -1;
//        while ( high >= low) {
//            int mid = (low + high)/2;
//            if (key < arr[mid] ){
//                high = mid -1;
//            } else if ( key == arr[mid]) {
//                return mid;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return  -1;
//    }

    static int binarySearch(int arr[], int low, int high, int value) {
        if (high>=low) {
            int mid = low + (high - low)/2;
            if (arr[mid] == value)
                return mid;
            if (value < arr[mid])
                return binarySearch(arr, low, mid-1, value);
            return binarySearch(arr, mid+1, high, value);
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] arr = {1,4,20,5,8,3,9,16,10};
//        chen(arr);
////        quick(arr, 0 , arr.length - 1);
//        System.out.println(Arrays.toString(arr));

        int[] arr = {1,4,5,8,9,10,16,18};
        System.out.println(binarySearch(arr,0, arr.length - 1, 9));
    }

}
