package npower.company;

// https://leetcode.com/problems/find-the-duplicate-number/

import java.util.Arrays;

public class FindTheDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,1,2};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] <= nums.length && nums[i]!=nums[correct]){
                swapArr(nums , i , correct);
            } else{
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));

        for (i = 0 ; i < nums.length ; i++){
            if(nums[i]!=i+1){
                return nums[i];
            }
        }

        return nums[nums.length-1];


    }

    static void swapArr(int[] nums, int i, int correct) {
        int t = nums[i];
        nums[i] = nums[correct];
        nums[correct] = t;
    }

}
