package npower.company;

// Find a index of number form array which is smaller or equal to target number

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {1,9,15,16,20,21,26,29,31,33,36,39,41,44,45,47,49,50,51,53,78,100};
        int floor  = floorArr(arr,17);
        System.out.println(floor);
    }

    static int floorArr(int[] arr,int target){
        int s = 0;
        int e = arr.length;
        int ans  = -1;
        while(s <= e){
            int m = (s+e)/2;
            if(arr[m]==target){
                return m;
            }
            else if(arr[m] > target){
                e = m-1;
            }
            else{
                ans = m;
                s = m + 1;
            }
        }

        // we can also return end;
        return ans;
    }

}

