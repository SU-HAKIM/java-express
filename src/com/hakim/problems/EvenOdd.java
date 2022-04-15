package com.hakim.problems;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int x;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a integer number : ");
        x=input.nextInt();

        if(x%2==0){
            System.out.println("You entered an even number.");
        }else{
            System.out.println("You entered a odd number.");
        }
    }
}
