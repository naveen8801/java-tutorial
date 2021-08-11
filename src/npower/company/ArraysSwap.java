package npower.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Type 5 elements of array");
        for (int i = 0; i < 5; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Type 2 indicies to be swaped");
        int index1 = in.nextInt();
        int index2 = in.nextInt();

        swapArray(arr , index1 , index2);

        System.out.println("After Swaping");
        System.out.println(Arrays.toString(arr));
    }

    static void swapArray(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
