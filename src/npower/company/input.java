package npower.company;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type your age");
        int age = input.nextInt();
        System.out.println("Type your fullname");
        String name = input.next();

        System.out.println("Hello "+name+" ,your age is "+age);
    }
}
