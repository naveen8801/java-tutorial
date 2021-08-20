package npower.company;

// https://leetcode.com/problems/split-array-largest-sum/

import javax.swing.*;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int ans = minLargestSubarraySum(arr , 2);
        System.out.println(ans);
    }

    static int minLargestSubarraySum(int[] nums,int target){
        int s = 0;
        int e = 0;
        for (int num : nums) {
            s = Math.max(s, num);
            e += num;
        }

        while(s < e){
            int m = s+ (e-s)/2;

            int sum = 0;
            int split = 1;

            for(int x : nums){
                if(sum + x > m){
                    sum = x;
                    split++;
                }
                else{
                    sum += x;
                }
            }
            if(split > target){
                s = m + 1;
            }
            else{
                e = m;
            }
        }

        return e; // or end cuz at the end both are equal

    }

}
