package npower.company;
import java.util.*;
import java.util.Arrays;

public class Extra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            long s = in.nextInt();
            int[] arr = new int[n];
            for (int i =0;i<n;i++){
                arr[i] = i+1;
            }
            int ans = TellMeAnswer(arr,n,s);
            System.out.println(ans);
            t--;
        }
    }

    static int TellMeAnswer(int[] arr,int n,long s){

        int pos = 0;

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 0;
        right[n-1] = 0;

        for (int i=1;i<arr.length;i++){
            left[i] = left[i-1] + arr[i-1];
        }

        for (int i=n-2;i>=0;i--){
            right[i] = right[i+1] + arr[i+1];
        }

        for (int i = 0;i<n;i++){
            if(left[i]+right[i]==s){
                return i+1;
            }
        }

        return -1;

    }

}
