package npower.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(checkPrime(n)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
