package at.rad.project.sortingAlgo;

import java.util.Random;;

public class Main {

    public static void randomFill(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(50);
        }
    }

    public static void printArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length-1; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int valueToSort = arr[i];
            int k = i;
            while(k> 0 && arr[k-1] > valueToSort){
                arr[k] = arr[k-1];
                k--;
            }
            arr[k] = valueToSort;
        }
        
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i< arr.length-1; i++){
            int min = i;
            for(int k = i +1; k < arr.length; k++){
                if(arr[min] > arr[k]){
                    min = k;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        randomFill(arr);
        printArray(arr);
        //bubbleSort(arr);
        //insertionSort(arr);
        selectionSort(arr);
        printArray(arr);
        
    }

}
