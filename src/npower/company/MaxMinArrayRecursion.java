package npower.company;

// https://www.geeksforgeeks.org/program-find-minimum-maximum-element-array/

import java.util.Arrays;

public class MaxMinArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {2,5,1,29,6,2,12,13,0,19};
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int[] maxmin = TellMeMaxMin(arr,min,max,0);
        System.out.println(Arrays.toString(maxmin));
    }

    static int[] TellMeMaxMin(int[] arr,int max,int min,int current){
        if(current == arr.length){
            return new int[]{max,min};
        }
        int max_ = Math.max(arr[current] , max);
        int min_ = Math.min(arr[current],min);
        return TellMeMaxMin(arr,max_,min_,current+1);
    }


}
