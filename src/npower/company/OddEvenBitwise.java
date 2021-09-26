package npower.company;

// Check if given number is Even or Odd

import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String ans = EvenOrOdd(n);
        System.out.println(ans);
    }

    static String EvenOrOdd (int n){
        if((n&1)==1){
            return "Odd";
        }
        else{
            return "Even";
        }
    }

}
