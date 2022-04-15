package com.hakim.problems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        /**
         * One way of calculating prime Number
         *
         *
         *         int x,count=0;
         *         Scanner input=new Scanner(System.in);
         *         System.out.println("Enter an integer number : ");
         *         x=input.nextInt();//?=> 13
         *
         *         for(int i=1;i<=x;i++){
         *             if(x%i==0){
         *                 count++;//1+1=2
         *             }
         *         }
         *
         *         if(count == 2){
         *             System.out.println("You entered a prime number.");
         *         }else{
         *             System.out.println("You did not enter a prime number. ");
         *         }
         *
         *
         */

        //? Another way....

            int x,ch=0;
            int j=2;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter an integer number : ");
            x=input.nextInt();//?=> 13

            if(x<=1){
                ch=1;
            }

            while(j<=x/2){
                if(x%j==0){
                    ch=1;
                    break;
                }
                else {
                    j++;
                }
            }

            if(ch==0){
                System.out.println("Prime");
            }else{
                System.out.println("Not");
            }
    }
}
