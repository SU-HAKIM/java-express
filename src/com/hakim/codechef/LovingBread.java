package com.hakim.codechef;

import java.util.Scanner;

public class LovingBread {

    public static void main(String[] args) {
        //? N loaves of bread
        //? after M days
        //? K loaves in a day
        //? N M K
        Scanner input=new Scanner(System.in);
        int times=input.nextInt();
        while(times > 0){

            int numberOfLoaves=input.nextInt();
            int expirationDays=input.nextInt();
            int loavesPerDay=input.nextInt();

            int canTotalEat=expirationDays*loavesPerDay;

            if(canTotalEat >= numberOfLoaves){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

            times--;
        }
    }
}
