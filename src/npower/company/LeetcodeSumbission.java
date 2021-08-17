package npower.company;

import java.util.Scanner;

public class LeetcodeSumbission {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        while(n>0){
            int[] arr = new int[11];
            int s = 0;
            int a = in.nextInt();
            arr[a]++;
            int b = in.nextInt();
            arr[b]++;
            int c = in.nextInt();
            arr[c]++;
            int d = in.nextInt();
            arr[d]++;
            for(int x : arr){
                if(x > 0){
                    s++;
                }
            }

            System.out.println(s/2);
            n--;
        }
    }
}