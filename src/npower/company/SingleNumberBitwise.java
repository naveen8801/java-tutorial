package npower.company;

// https://leetcode.com/problems/single-number/

public class SingleNumberBitwise {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int ans = singleNumber(arr);
        System.out.println(ans);
    }
    static int singleNumber(int[] nums) {
        int s = 0;
        for (int i = 0;i<nums.length;i++){
            s = s ^ nums[i];
        }
        return s;
    }
}
