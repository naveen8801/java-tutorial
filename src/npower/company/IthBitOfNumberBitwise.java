package npower.company;

import java.util.Scanner;

// Find the ith Bit of a number

public class IthBitOfNumberBitwise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = in.nextInt();
        int ans = ithBit(num , i);
        System.out.println(ans);
    }

    static int ithBit(int n , int k){
        return  ((n & (1 << (k - 1))) >> (k - 1));
    }

}
