package npower.company;

import java.util.Arrays;

// https://www.geeksforgeeks.org/sum-triangle-from-array/

public class SumTriangleRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sumTriangle(arr,arr.length);
    }
    static void sumTriangle(int[] arr,int n){
        if(n==0){
            return;
        }
        int[] temp = new int[n-1];
        for (int i = 0;i<n-1;i++){
            temp[i] = arr[i] + arr[i+1];
        }
        sumTriangle(temp , n-1);
        System.out.println(Arrays.toString(arr));
    }
}
