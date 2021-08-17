package npower.company;

import java.util.Scanner;

public class ArraysBinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr= {3,6,78,98,102,121,212,321,431};
        int index = BinarySearchArray(arr,198);
        System.out.println(index);
    }

    static int BinarySearchArray(int[] arr, int key) {
        int a = 0;
        int b = arr.length-1;
        int mid = 0;
        while(a <= b ){
            mid = (a+b)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                b = mid -1 ;
            }
            else{
                a = mid +1 ;
            }
        }

        return -1;
    }
}
