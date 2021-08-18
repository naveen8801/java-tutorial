package npower.company;

// Find pivot (minimum element) in rotated sorted array

public class PivotInRoatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int index = findPivot(arr);
        System.out.println(index);
    }

    static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length -1;
        int last = arr.length -1;
        while(s < e){
            int m = s + (e-s)/2;
            if(arr[m] > arr[last]){
                s = m + 1;
            }
            else{
                e = m;
            }
        }

        return e;

    }

}
