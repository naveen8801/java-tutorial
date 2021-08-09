package npower.company;

import java.util.Scanner;

public class CountOccurances {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long in = input.nextInt();
        int key = input.nextInt();

        long r = 0;
        int count = 0;

        while(in > 0){
            r = in%10;
            in = in/10;
            if(r == key) {
                count++;
            }
        }

        System.out.println(count);

    }
}
