package com.hakim.codechef;

import java.util.Scanner;

public class FootballMatch {
    public static void main(String[] args) {
        //? goal
        //? team 1 => A
        //? team 2 => B
        //? should goal
        //? team 1 => C
        //? team 2 => D

        Scanner input=new Scanner(System.in);


        int times=input.nextInt();

        while(times>0){

            //? Pair one
            int teamOnePrev=input.nextInt();
            int teamTwoPrev=input.nextInt();

            //?Pair two
            int teamOneNext=input.nextInt();
            int teamTwoNext=input.nextInt();

            if(teamOneNext >= teamOnePrev && teamTwoNext >= teamTwoPrev){
                System.out.println("POSSIBLE");
            }else{
                System.out.println("IMPOSSIBLE");
            }



            times--;
        }
    }
}
