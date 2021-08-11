package npower.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMoveelements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Move all the negative elements to the left and positive elements on the right
        int[] arr = {2 ,4, -1, 5, -6, -9, -1, 12, 11, 19, -16};

        moveArray(arr);

        System.out.println(Arrays.toString(arr));

    }
    static void moveArray(int[] arr){
        int s = 0;

        for (int i = 0; i < arr.length ;i++){
            if(arr[i] < 0){
                swapArray(arr , s ,i);
                s++;
            }
        }
    }

    static void swapArray(int[] arr, int s, int i) {
        int temp = arr[s];
        arr[s] = arr[i];
        arr[i] = temp;
    }
}
