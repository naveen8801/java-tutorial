package npower.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("type 5 elements array");

        for (int i= 0 ; i<5 ; i++){
            arr[i] = in.nextInt();
        }

        reverseArray(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void reverseArray(int[] arr) {
        int s = 0;
        int e = arr.length -1;
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
