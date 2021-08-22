package npower.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,9,0,2,10,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j+1]<arr[j]){
                    swap(j,j+1,arr);
                }
            }
        }
    }

    static void swap (int j , int i , int[] arr){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
