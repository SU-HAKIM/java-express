package com.hakim.bookRevise;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter month value : ");
        int month=input.nextInt();

        int monthDays=switch(month){
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9,11 -> 30;
            case 2 -> {
                System.out.println("Enter year : ");
                int year=input.nextInt();

                if(year%4==0){
                    yield 29;
                }else{
                    yield 28;
                }
            }
            default -> 0;
        };


        System.out.println(monthDays);
    }
}



