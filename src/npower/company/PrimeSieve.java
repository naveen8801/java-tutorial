package npower.company;

import java.util.Scanner;

// Print all the prime numbers upto n

public class PrimeSieve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        primeSeive(n);
    }
    static void primeSeive(int n){
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2;i<=n;i++){
            if(arr[i]==0){
                int j = 2;
                while(j*i<=n){
                    arr[j*i] = 1;
                    j++;
                }
            }
        }
        for(int i=0;i<=n;i++){
            if(arr[i]==0){
                System.out.print(i+" ");
            }
        }
    }
}
