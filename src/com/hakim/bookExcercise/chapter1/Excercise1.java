package com.hakim.bookExcercise.chapter1;

import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int one=input.nextInt();
        System.out.println("Enter second number : ");
        int two=input.nextInt();

        System.out.println(one+two);
        System.out.println(one-two);
        System.out.println(one*two);
        System.out.println(one/two);
    }
}
