package npower.company;

// https://leetcode.com/problems/first-missing-positive/

public class MissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }

    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i]!=nums[correct]){
                swapArr(nums , i , correct);
            }
            else{
                i++;
            }
        }

        for (i = 0; i< nums.length ; i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }

        return nums.length +1;

    }

    static void swapArr(int[] nums, int i, int correct) {
        int t = nums[i];
        nums[i] = nums[correct];
        nums[correct] = t;
    }
}
