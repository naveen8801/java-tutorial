package npower.company;

import java.util.Scanner;

// First Occurance of element in array using binary search

public class LowerBoundOfElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,2,3,3,3,6,7,7,7};
        int ans  = lowerBound(arr , 7);
        System.out.println(ans);
    }
    static int lowerBound(int[] arr ,int target){
        int a = 0;
        int b = arr.length-1;
        int lowerbound = -1;
        while(a <= b){
            int mid = (a+b)/2;
            if(arr[mid]==target){
                lowerbound = mid;
                b = mid -1;
            }
            else if(arr[mid] < target ){
                a = mid +1;
            }
            else{
                b = mid - 1;
            }
        }
        return lowerbound;
    }
}
