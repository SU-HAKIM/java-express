package com.hakim.problems;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a year : ");
        int year=input.nextInt();

        boolean dividedBy4=year%4==0;
        boolean dividedBy400=year%400==0;
        boolean dividedBy100=year%100==0;

        if((dividedBy4 && !dividedBy100)||dividedBy400){
            System.out.println("Leap year");
        }else{
            System.out.println("Not");
        }
    }
}
