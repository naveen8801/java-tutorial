package npower.company;

import java.util.Scanner;

public class FactorsOfaNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        factors(n);
    }

    static void factors(int n) {
        for (int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.println(i);
                }
                else {
                    System.out.println(i+" "+n/i);
                }

            }
        }
    }
}
