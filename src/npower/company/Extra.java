package npower.company;

import java.util.Arrays;
import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n ;i++){
                arr[i] = in.nextInt();
            }
            int ans = TellMeAnswer(n , k ,arr);
            System.out.println(ans);
            
            t--;
        }
    }

    static int TellMeAnswer(int n , int k , int[] arr){
        int sum = 0;
        Arrays.sort(arr);
        int i = 0;
        while(k > 0 && arr[i] < 0){
            sum = sum + arr[i]*-1;
            i++;
            k--;
        }
        i = n-1;
        while(i >= 0 && arr[i] > 0){
            sum = sum + arr[i];
            i--;
        }

        return  sum;
    }

}
