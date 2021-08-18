package npower.company;

// https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int index = search(arr , 0);
        System.out.println(index);
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotElement(nums);
        int firsttry = binarySearch(nums,target,0,pivot-1);
        if(firsttry!=-1) {
            return firsttry;
        }
        else{
            return binarySearch(nums,target,pivot,nums.length-1);
        }
}

    private static int binarySearch(int[] nums, int target, int s, int e ) {
        while(s <=e ){
            int m = s + (e-s)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[m] < target){
                s = m + 1;
            }
            else{
                e = m -1;
            }
        }
        return  -1;
    }

    private static int findPivotElement(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int last = e;
        while(s < e){
            int m = s + (e - s)/2;
            if(nums[m] > nums[last]){
                s = m+1;
            }
            else{
                e = m;
            }
        }
        return  e;
    }

}

