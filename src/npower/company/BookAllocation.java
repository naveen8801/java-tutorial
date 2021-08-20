package npower.company;

public class BookAllocation {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int ans = AllocatePages(arr , 2);
        System.out.println(ans);
    }

    static int AllocatePages(int[] arr,int target){
        int s = 0;
        int e = 0;
        for(int x : arr){
            s = Math.max(s,x);
            e += x;
        }

        while(s < e){
            int m = s + (e-s)/2;

            int count = 1;
            int pages = 0;

            for(int x : arr){
                if(pages+x > m){
                    pages = x;
                    count++;
                }
                else{
                    pages+=x;
                }
            }

            if(count > target)
            {
                s = m +1;
            }
            else{
                e = m;
            }

        }

        return s;

    }

}
