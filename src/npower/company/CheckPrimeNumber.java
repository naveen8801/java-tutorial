package npower.company;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int c = 2;
        if(num<=1){
            System.out.println("Neither prime nor composite");
            return;
        }
        if(num==4){
            System.out.println("Not a prime");
            return;
        }

        else{
            while(c * c <num){
                if(num%c==0){
                    System.out.println("Not a Prime number");
                    return;
                }
                c++;
            }

        }
        if(c*c>num){
            System.out.println("Is a Prime number");
        }

    }
}
