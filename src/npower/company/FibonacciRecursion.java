package npower.company;

import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = NthFibonacciNumber(n);
        System.out.println(p);
    }

    static int NthFibonacciNumber(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return NthFibonacciNumber(n-1)+NthFibonacciNumber(n-2);
    }

}
