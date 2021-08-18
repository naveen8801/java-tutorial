package npower.company;

// Print index of number just grater then or equal to target number

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {1,9,15,16,20,21,26,29,31,33,36,39,41,44,45,47,49,50,51,53,78,100};
        int celing = celingArr(arr , 33);
        System.out.println(celing);
    }

    static int celingArr(int[] arr, int target){

        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s <= e){
            int m = (s+e)/2;
            if(arr[m]==target){
                return m;
            }
            else if(arr[m] < target){
                s = m + 1;
            }
            else{
                ans = m;
                e = m - 1;
            }
        }

        // we can also return start;
        return ans;
    }

}
