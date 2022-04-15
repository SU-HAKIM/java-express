package com.hakim.bookExcercise.chapter1;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        int winScore=3;
        int drawScore=1;
        int loseScore=0;

        Scanner input=new Scanner(System.in);

        System.out.println("Enter wins:");
        int wins=input.nextInt();
        System.out.println("Enter draws:");
        int draws=input.nextInt();
        System.out.println("Enter loses:");
        int loses=input.nextInt();

        int totalMarks=wins*winScore + draws*drawScore;

        System.out.println("Total Score : "+totalMarks);
    }
}
