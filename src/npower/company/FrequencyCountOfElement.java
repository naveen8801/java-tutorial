package npower.company;

import java.util.Scanner;

import static npower.company.LowerBoundOfElement.lowerBound;
import static npower.company.UpperBoundOfElement.upperBound;

public class FrequencyCountOfElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,2,3,3,3,6,7,7,7};
        int ans = countFrequencies(arr,2);
        System.out.println(ans);
    }
    static int countFrequencies(int[] arr,int target){
        return (upperBound(arr,target) - lowerBound(arr,target)+1);
    }
}
