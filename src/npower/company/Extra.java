package npower.company;
import java.util.*;
import java.util.Arrays;

public class Extra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0){
            String s = in.next();

            int ans = tellMeAnswer(s);
            System.out.println(ans);


            t--;
        }
    }

    static int tellMeAnswer(String s){
        char search = '0';
        int count = 0;
        for (int i = 0;i<s.length();i++){
            if(s.charAt(i)==search){
                if(s.charAt(i)=='0'){
                    search = '1';
                }
                else{
                    search = '0';
                }
                count++;
            }
        }
        return count;
    }

    static void flipIt (char[] s , int i){
        for (int a = i;a<s.length;a++){
            if(s[a]=='0'){
                s[a] = '1';
            }
            else {
                s[a] = '0';
            }
        }
    }

//    static long TellMeAnswer(long p,long a ,long b,long c,long x,long y) {
//        long count = 0;
//        long rem = 0;
//        if(x<y){
//            count = p/(b+(x*a));
//            rem = p - count*(b+(x*a));
//            count += rem / (c+(y*a));
//        }
//        else{
//            count = p/(c+(y*a));
//            rem = p - count*(c+(y*a));
//            count+= rem/(b+(x*a));
//        }
//        return count;
//    }
}
