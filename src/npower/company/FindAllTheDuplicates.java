package npower.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class FindAllTheDuplicates {
    public static void main(String[] args) {
        int[] arr = {1};
        List<Integer> ans = findDuplicates(arr);
        System.out.println(ans);


    }

    static List<Integer> findDuplicates(int[] nums) {

        List<Integer> output = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] <= nums.length && nums[i]!=nums[correct]){
                swapArr(nums , i , correct);
            }
            else{
                i++;
            }
        }

        for (i = 0; i  <nums.length ; i++){
            if(nums[i]!= i+1){
                output.add(nums[i]);
            }
        }

        return output;
    }

    static void  swapArr(int[] arr , int i , int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

}
