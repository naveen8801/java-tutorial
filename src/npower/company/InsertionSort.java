package npower.company;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2,22,1,0,20,16,11,14,13,4,8,7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1 ; i++){
            for (int j=i+1 ;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swapMinimum(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swapMinimum(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

}
