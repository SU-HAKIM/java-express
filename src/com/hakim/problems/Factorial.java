package com.hakim.problems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int x,fact=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        x=input.nextInt();
        for(int i=1;i<=x;i++){
            fact*=i;
        }

        System.out.println("Factorial of "+x+" is "+fact);
    }
}
