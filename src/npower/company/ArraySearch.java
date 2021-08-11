package npower.company;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));

        System.out.println("Type size of array");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Type elements of array");

        for (int i = 0; i < n ;i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Type element to be searched");
        int key = in.nextInt();

        int index = searchArray(arr,key);

        if(index==-1){
            System.out.println("No Such Element Found");
        }
        else{
            System.out.println("Element Found At Index: " + index);
        }


    }

    static int searchArray(int[] arr, int key) {
        for (int i = 0; i<arr.length ; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
