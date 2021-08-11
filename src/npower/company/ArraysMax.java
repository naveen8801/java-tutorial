package npower.company;

import java.util.Scanner;

public record ArraysMax() {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Type 5 elements of array");

        for (int i = 0; i<5 ; i++){
            arr[i] = in.nextInt();
        }

        int ans = maxArray(arr);

        System.out.println("Max element " + ans);

    }

    static int maxArray(int[] arr) {
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }


}
