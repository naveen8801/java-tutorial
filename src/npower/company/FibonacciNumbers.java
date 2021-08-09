package npower.company;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int a = 0;
        int b = 1;
        int ans = 0;

        if(n==1){
            System.out.println(0);
            return;
        }
        if(n==2){
            System.out.println(1);
            return;
        }

        for(int i = 3 ; i <= n ; i++){
            ans = a+b;
            a = b;
            b = ans;
        }

        System.out.println(ans);

    }
}