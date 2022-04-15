package com.hakim.bookRevise;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Number : ");
        int num=input.nextInt();

        int i=1;

        while(i<=10){
            System.out.println(i+" x "+num+" = "+i*num);

            i++;
        }
    }
}
