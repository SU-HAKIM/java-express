package com.hakim.problems;

import java.util.Scanner;

public class SwappingWithoutVariables {
    public static void main(String[] args) {
        int one,two;
        Scanner input =new Scanner(System.in);

        System.out.println("Enter first number : ");
        one=input.nextInt();//10
        System.out.println("Enter second number : ");
        two=input.nextInt();//20

        one=one+two;//30
        two=one-two;//10
        one=one-two;//20

        System.out.println("One : "+one);
        System.out.println("Two : "+two);
    }
}
