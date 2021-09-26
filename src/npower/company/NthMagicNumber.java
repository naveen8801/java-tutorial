package npower.company;

// Find nth Magic number i.e
// 1st => 0 0 0 1 => 0*5^4 + 0*5^3 + 0*5^2  + 1*5^1 = 5
// 2nd => 0 0 1 0 => 0*5^4 + 0*5^3 + 1*5^2  + 0*5^1 = 25..........so on

import java.util.Scanner;

public class NthMagicNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = MagicNumber(n);
        System.out.println(ans);
    }

    static int MagicNumber(int n){
        int ans = 0;
        int p = 1;
        while(n!=0){
            ans += (n&1)*Math.pow(5,p);
            p++;
            n = n >> 1;
        }
        return ans;
    }

}
