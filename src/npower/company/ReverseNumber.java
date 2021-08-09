package npower.company;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int s = 0;
        int r = 0;

        while(a > 0){
            r = a%10;
            s = ((s*10)+r);
            a = a/10;
        }

        System.out.println(s);

    }
}
