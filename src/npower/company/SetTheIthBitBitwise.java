package npower.company;

// Set ( turn into 1) the ith bit of a number
import java.util.Scanner;

public class SetTheIthBitBitwise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = in.nextInt();
        System.out.println(Integer.toBinaryString(n));
        int ans = setithBit(n , i);
        System.out.println(Integer.toBinaryString(ans));
    }

    static int setithBit(int n ,int k){
        return (n|(1 << (k-1)));
    }

}
