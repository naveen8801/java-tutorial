package npower.company;


import java.util.Scanner;

public class UpperBoundOfElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 2, 3, 3, 3, 6, 7, 7, 7};
        int ans = upperBound(arr, 7);
        System.out.println(ans);
    }
    static int upperBound(int[] arr, int target){
        int s = 0;
        int e = arr.length -1;
        int upperbound = -1;
        while(s <= e){
            int mid = (s+e)/2;
            if(arr[mid]==target){
                upperbound = mid;
                s = mid +1;
            }
            else if(arr[mid] < target){
                s = mid +1;
            }
            else{
                e = mid -1;
            }
        }
        return  upperbound;
    }
}