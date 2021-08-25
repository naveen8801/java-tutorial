package npower.company;

import java.util.Arrays;
import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0){
            int a = in.nextInt();
            int b = in.nextInt();
            int ans = TellMeAnswer(a,b);
            System.out.println(ans);
            
            t--;
        }
    }

    static int TellMeAnswer(int a , int b){
        float max = 0;
        for(int i = Math.min(a,b)+1; i < Math.max(a,b) ; i++){
            float check = (b-i)/2 + (i-a)/2;
            max = Math.max(check,max);
        }

        return (int)max;
    }

}
