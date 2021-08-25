package npower.company;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2,22,1,0,20,16,11,14,13,4,8,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i = 0;i < arr.length-1; i++){
            int j = i;
            int min = j;
            while(j<arr.length){
                if(arr[j] < arr[min]){
                    min = j;
                }
                j++;
            }
            swapMinimum(arr,i,min);
        }
    }

     static void swapMinimum(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }



}
