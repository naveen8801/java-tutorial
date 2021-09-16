package npower.company;

// https://leetcode.com/problems/reverse-string/

public class ReverseStringRecursion {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseIt(s,0,s.length-1);
        System.out.println(s);
    }
    static void reverseIt(char[] s,int start,int end){
        if(start >= end){
            return;
        }
        char p = s[start];
        s[start] = s[end];
        s[end] = p;
        reverseIt(s,start+1,end-1);
    }
}
