package npower.company;

import java.util.Arrays;
import java.util.Scanner;

// Static main functions can only call static functions
// variable length args are basically arrays (int ...a)
// There are no pointers in java



public class Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        // Returning nothing (void)
        sum(num1, num2);

        //Returning sum;
        int ans = sum_(num1,num2);
        System.out.println(ans);

        //Variable length args
        printNums(1,2,3,4,5);
    }

    static void printNums(int ...nums) {
        System.out.println(Arrays.toString(nums));
    }

    static int sum_(int num1, int num2) {
        return (num1+num2);
    }

    static void sum(int a , int b){
        System.out.println(a+b);
    }
}
