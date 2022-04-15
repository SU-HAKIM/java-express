package com.hakim.codechef;



import java.util.Scanner;

public class Cooler {
    public static void main(String[] args) {
        //? Purchase at Y coin per month
        //? Rent a cooler at the cost of X coins per month



        //? Number of months he can rent for




        Scanner input = new Scanner(System.in);

        int times = input.nextInt();

        while(times > 0){

            int rentCost=input.nextInt();
            int purchaseCost=input.nextInt();

            int timesPurchase=purchaseCost/rentCost;
            int leftCoin=purchaseCost % rentCost;

            if(timesPurchase > 0 && leftCoin !=0){
                System.out.println(timesPurchase);
            }else {
                System.out.println(0);
            }


            times--;
        }
    }
}
