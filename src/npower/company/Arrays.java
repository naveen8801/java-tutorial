package npower.company;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Syntax
        // Datatype[] name = new Datatype[size]

        int[] roll_no = new int[3];

        String[] name = new String[3];

        //Input
        for(int i = 0; i < roll_no.length ; i++){
            roll_no[i] = in.nextInt();
        }

        for(int i = 0; i < name.length ; i++){
            name[i] = in.next();
        }

        //Display
        for(int i : roll_no){
            System.out.println(i);
        }

        for(String s : name){
            System.out.println(s);
        }

    }
}
