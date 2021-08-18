package npower.company;

// Find peak element in mountain array

public class PeakElementInMOuntainArray {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        int indexPeak = findPeak(arr);
        System.out.println(indexPeak);
    }

    static int findPeak(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        while( s < e){
            int m = s + (e-s)/2;
            if(arr[m] > arr[m+1]){
                e = m;
            }
            else{
                s = m + 1;
            }
        }
        // s ans e both points at maximum peak
        return s;
    }

}
