package npower.company;

import java.util.Scanner;

public class DivisonBinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dividend = in.nextInt();
        int divisor = in.nextInt();
        System.out.println(divide(dividend,divisor));
    }
    static int divide(int dividend, int divisor) {
        int divid = Math.abs(dividend);
        int divis = Math.abs(divisor);
        int s = 1;
        int e = divid;
        int ans = 0;
        while(s<=e){
            int m = s + (e-s)/2;
            if(m*divis == divid){
                ans = m;
                s = m+1;
            }
            else if(m*divis<divid){
                ans = m;
                s = m+1;
            }
            else {
                e = m-1;
            }
        }
        if(dividend<0 && divisor<0 || dividend>0 && divisor>0){
            return ans;
        }
        else {
            return -1*ans;
        }
    }
}
