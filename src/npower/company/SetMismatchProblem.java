package npower.company;

// https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMismatchProblem {
    public static void main(String[] args) {
        int[] arr = {1,1};
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swapArr(nums, i ,correct);
            }
            else{
                i++;
            }
        }

        for (i = 0 ; i < nums.length ; i++){
            if(nums[i]!=i+1){
                ans[0] = nums[i];
                ans[1] = i+1;
            }
        }

        return ans;

    }

    static void swapArr(int[] nums, int i, int correct) {
        int t = nums[i];
        nums[i] = nums[correct];
        nums[correct] = t;
    }

}
