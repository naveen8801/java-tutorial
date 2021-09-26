package npower.company;

// Reset ( make it 0 ) the ith bit of a number

import java.util.Scanner;

public class ResetIthBitBitwise {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = in.nextInt();
        System.out.println(Integer.toBinaryString(num));
        int ans = ResetTheIthBit(num , i);
        System.out.println(Integer.toBinaryString(ans));

    }

    static int ResetTheIthBit(int n , int k ){
        return (n&(~(1 << (k - 1))));
    }

}
