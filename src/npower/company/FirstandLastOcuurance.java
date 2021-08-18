package npower.company;

// Find first occurance and last occurance of a number in a array
// With help of occuarances we can also cout no. of times target is occuring

import java.util.Arrays;

public class FirstandLastOcuurance {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int[] rangeOfOccurance = occurance(arr , 8);
        System.out.println(Arrays.toString(rangeOfOccurance));
    }
    static int[] occurance(int[] arr , int target){
        int s = 0;
        int e = arr.length;
        int first = -1;
        int last = -1;
        while(s <= e){
            int m = (s+e)/2;
            if(arr[m]==target){
                first = m;
                e = m -1;
            }
            else if(arr[m]<target){
                s = m + 1;
            }
            else{
                e = m -1;
            }
        }
        s = 0;
        e = arr.length - 1;
        while(s <= e){
            int m = (s+e)/2;
            if(arr[m]==target){
                last = m;
                s = m + 1;
            }
            else if(arr[m]<target){
                s = m + 1;
            }
            else{
                e = m -1;
            }
        }
        return new int[]{first,last};
    }
}
