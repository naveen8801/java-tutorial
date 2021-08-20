package npower.company;

// https://www.spoj.com/problems/AGGRCOW/

import java.util.Arrays;
import java.util.Scanner;

public class AgressiveCows {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int target = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n;i++){
            arr[i] = in.nextInt();
        }

        int ans = LargestMinimumDistance(arr , target);
        System.out.println(ans);

    }

    static int LargestMinimumDistance(int[] arr,int target){
        int s;
        int e;
        int ans = -1;
        Arrays.sort(arr);
        s = arr[1]-arr[0];
        e = arr[arr.length-1]-arr[0];
        while(s <= e){
            int m = s + (e-s)/2;
            int cows = arr[0];
            int count = 1;
            for (int i = 1; i< arr.length ;i++){
                if(arr[i] - cows >= m){
                    count++;
                    cows = arr[i];
                }
            }

            if(count==target){
                ans = count;
                s = m + 1;
            }
            else{
                e = m -1;
            }

        }

        return  ans;
    }
}
