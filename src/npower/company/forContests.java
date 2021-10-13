package npower.company;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/********** Classes for Fast IO *******************/
public class forContests {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        float nextFloat(){
            return Float.parseFloat(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    /********** Classes for Fast IO *******************/


    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        int t = in.nextInt();
        while(t>0){
           int n = in.nextInt();
           int h = in.nextInt();
           int[] arr = new int[n];
           for (int i = 0;i<n;i++){
               arr[i] = in.nextInt();
           }
           int ans = TellMeAnswer(arr,n,h);
           System.out.println(ans);
           t--;
        }
    }

    static int TellMeAnswer(int[] arr,int n,int h){
        return 0;
    }

}
