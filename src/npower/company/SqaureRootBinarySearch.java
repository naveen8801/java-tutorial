package npower.company;

import java.util.Scanner;

public class SqaureRootBinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number whoose sqaure root you wanna find");
        int n = in.nextInt();
        System.out.println(squareRoot(n));
    }
    static int squareRoot(int n){
        int s = 0;
        int e = n ;
        int ans = -1;
        while(s <= e){
            int mid  = (s+e)/2;
            if(mid*mid == n){
                ans = mid;
                return ans;
            }
            else if (mid*mid < n){
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return ans;
    }
}
