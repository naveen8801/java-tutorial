package npower.company;

import java.util.Arrays;

// index = value - 1

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};

        sortCyclic(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void sortCyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1; // Correct index of current element
            if(arr[i]!=arr[correct]){
                swapArr(arr , i , arr[i] - 1 );
            }
            else{
                i++;
            }
        }
    }

    static  void swapArr(int[] arr , int i , int j ){
        int t = arr[i];
        arr[i]  =arr[j];
        arr[j] = t;
    }

}
