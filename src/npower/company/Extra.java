package npower.company;

import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            int ans = TellMeOutingOrNot(a,b,c);
            System.out.println(ans);
            
            t--;
        }
    }

    static int TellMeOutingOrNot(int a,int b,int c) {
        int z= 0;
        if(a==0){
            z++;
        }
        if(b==0){
            z++;
        }if(c==0){
            z++;
        }

        if(z!=0 && z!=3){
            return 1;
        }
        else{
            return 0;
        }

    }
}