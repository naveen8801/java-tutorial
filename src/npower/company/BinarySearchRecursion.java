package npower.company;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,12};
        int index = recursiveBinarySearch(arr,0,arr.length-1,5);
        System.out.println(index);
    }

    static int recursiveBinarySearch(int[] arr , int s , int e , int target){

        if(s>e){
            return -1;
        }

        int m = s + (e-s)/2;

        if(arr[m]==target){
            return m;
        }
        if(arr[m] > target){
            return recursiveBinarySearch(arr,s,m-1,target);
        }
        return recursiveBinarySearch(arr,m+1,e,target);

    }

}
