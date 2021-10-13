package npower.company;

// Print the patter if n = 5
// 5 4 3 2 1 1 2 3 4 5

import java.util.Scanner;

public class UptotonPatternRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printIt(n);
    }

    static void printIt(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printIt(n-1);
        System.out.print(n+" ");
    }

}
