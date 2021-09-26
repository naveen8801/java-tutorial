package npower.company;

// https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/

public class PairsWithAbsDiff {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int ans = countKDifference(nums , 1);
        System.out.println(ans);
    }

    static int countKDifference(int[] nums, int k) {
        int count  = 0;
        for (int i=0;i<nums.length;i++){
            int j = i+1;
            while(j < nums.length){
                if(Math.abs(nums[i] -nums[j])==k){
                    count += 1;
                }
                j+=1;
            }
        }
        return count;
    }

}
