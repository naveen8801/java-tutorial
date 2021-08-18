package npower.company;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {10,22,33,41,30,20};
        int index = SearchingInArr(arr , 20);
        System.out.println(index);

    }

    static int OrderAgnosticBinarySearch(int[] arr ,int target , int s , int e){
        boolean isAscending = arr[s] < arr[e];

        while(s <= e){
            int m = s +(e -s)/2;
            if(arr[m]==target){
                return m;
            }
            if(isAscending){
                if(arr[m] < target){
                    s = m+1;
                }
                else{
                    e = m-1;
                }
            }
            else{
                if(arr[m]<target){
                    e = m-1;
                }
                else{
                    s = m+1;
                }
            }
        }
        return -1;
    }

    static  int SearchingInArr(int[] arr , int target){
        int peak = PeakInMountainArray(target , arr);
        int firsttry = OrderAgnosticBinarySearch(arr , target , 0 , peak);
        if(firsttry!=-1){
            return firsttry;
        }
        else{
            int secondtry = OrderAgnosticBinarySearch(arr , target , peak + 1 , arr.length - 1);
            return  secondtry;
        }
    }

    static int PeakInMountainArray(int target, int[] mountainArr) {
        int s = 0;
        int e = mountainArr.length -1;
        while(s < e){
            int m = s + (e-s)/2;
            if(mountainArr[m] > mountainArr[m+1]){
                e = m;
            }
            else{
                s = m +1;
            }
        }
        return s;
    }

}
