package npower.company;
import java.util.*;
import java.util.Arrays;

public class Extra {
    public static void main(String[] args) {
        String s = "Mom and Dad are my best friends";
        int ans = countPalindrome(s);
        System.out.println(ans);
    }

    static int countPalindrome(String str)
    {
        int count = 0;
        String[] s = str.split(" ");
        for(String n : s){
            if(isPlanidrome(n)){
                count++;
            }
        }
        return count;
    }

    static boolean isPlanidrome(String p) {
        String m = p.toLowerCase(Locale.ROOT);
        char[] c = m.toCharArray();
        int s = 0;
        int e = p.length()-1;
        while(s<e){
            if(c[s]!=c[e]){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
