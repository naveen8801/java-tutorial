package npower.company;

import java.util.Scanner;

public class ArmstrngNumFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        if(isArmstrng(num)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }

    static boolean isArmstrng(int num) {

        int t = num;
        int r = 0;
        int s = 0;
        while(num > 0){
            r = num%10;
            s = s + r*r*r;
            num = num/10;
        }
        return t == s;
    }
}
