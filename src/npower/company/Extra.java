package npower.company;
import java.util.*;
import java.util.Arrays;

public class Extra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            int s = in.nextInt();
            int[] arr = new int[n];
            for (int i =0;i<n;i++){
                arr[i] = i+1;
            }
            int ans = TellMeAnswer(arr,n,s);
            System.out.println(ans);
            t--;
        }
    }

    static int TellMeAnswer(int[] arr,int n,int s){

        int pos = (n*(n+1))/2 - s;
        if(pos<=n && pos >=1){
            return pos;
        }
        else{
            return -1;
        }


    }

}
