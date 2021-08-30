package npower.company;

// https://leetcode.com/problems/missing-number/

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr ={0};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    static int missingNumber(int[] nums) {
        int n = 0;
        while(n < nums.length){
            int correct = nums[n];
            if(nums[n] < nums.length && nums[n]!=nums[correct]){
                swapArr(nums , n , nums[n]);
            }
            else{
                n++;
            }
        }

        for (int i = 0; i < nums.length ; i++){
            if(nums[i]!=i){
                return i;
            }
        }

        return nums.length;
    }

    static void swapArr(int[] nums, int num, int n) {
        int t = nums[num];
        nums[num] = nums[n];
        nums[n] = t;
    }

}
