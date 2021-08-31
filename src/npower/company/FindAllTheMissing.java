package npower.company;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Google

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllTheMissing {
    public static void main(String[] args) {
        int[] arr = {1,1};
        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(ans);
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> output = new ArrayList<>();
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1; // Correct index of current element
            if(nums[i] <= nums.length && nums[i]!=nums[correct]){
                swapArr(nums , i , correct);
            }
            else{
                i++;
            }
        }

        for ( i = 0; i < nums.length ; i++){
            if(nums[i]!=i+1){
                output.add(i+1);
            }
        }

        return output;
    }

    static void swapArr(int[] nums, int i, int correct) {
        int t = nums[i];
        nums[i] = nums[correct];
        nums[correct] = t;
    }
}
