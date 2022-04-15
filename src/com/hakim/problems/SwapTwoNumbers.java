package com.hakim.problems;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int one=input.nextInt();
        System.out.println("Enter number 2: ");
        int two=input.nextInt();

        int temp=one;
        one=two;
        two=temp;

        System.out.println("First one : "+one);
        System.out.println("Second one : "+two);
    }
}
