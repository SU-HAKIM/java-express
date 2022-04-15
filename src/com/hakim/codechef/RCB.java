package com.hakim.codechef;

import java.util.Scanner;

public class RCB {
    public static void main(String[] args) {
        // X => earned point
        // Y => at least point
        // Z => games left
        // 2 for win
        // 1 for draw
        // 0 for lose
        Scanner input=new Scanner(System.in);
        //? point 5 need 10 left 4
        //? 2 of 4 win = 4 ; 5+4=9 fail
        //?2 of 4 lose

        int times=input.nextInt();

        while(times > 0){

            int point=input.nextInt();
            int pointNeeded=input.nextInt();
            int gamesLeft=input.nextInt();

            if((gamesLeft * 2) + point >= pointNeeded ){
                System.out.println("Yes");
            }else {
                System.out.println("NO");
            }

            times--;
        }

    }
}





