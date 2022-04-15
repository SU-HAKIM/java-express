package com.hakim.codechef;

import java.util.Scanner;

public class EzioAndGuards {
    public static void main(String[] args) {
        //? X number of Guards
        Scanner input=new Scanner(System.in);
        int times=input.nextInt();

        while(times > 0){

            int canManipulate=input.nextInt();
            int numberOfGuards=input.nextInt();

            if(canManipulate >= numberOfGuards){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

            times--;
        }
    }
}
