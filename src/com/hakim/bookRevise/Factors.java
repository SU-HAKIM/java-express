package com.hakim.bookRevise;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number : ");
        long num=input.nextLong();

        System.out.println("Prime factors of "+ num + " are : ");
        for(long i=2;i<num/i;i++){
            System.out.println(num);
            while(num%i==0){
                System.out.println(i+" f");

                num=num/i;
            }
        }

        if(num>1){
            System.out.print(num +" f");
        }
    }
}
