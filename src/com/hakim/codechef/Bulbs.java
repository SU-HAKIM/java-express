package com.hakim.codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bulbs {
    public static void main(String[] args) {
        //? X units
        //? test in N bulbs
        //? i am given N -1

        Scanner input=new Scanner(System.in);

        int times=input.nextInt();

        while(times>0){
            List<Integer> list=new ArrayList<>();
            //? Amount of test bulbs , Average test units
            int numberOfBulbs=input.nextInt();
            int averageUnits=input.nextInt();

            int i=numberOfBulbs -1;

            while(i > 0){
                list.add(input.nextInt());
                i--;
            }

            int sum=sumOfList(list);

            int diff=(numberOfBulbs*averageUnits)-sum;

            if(diff > 0){
                System.out.println(diff);
            }else{
                System.out.println(0);
            }

            times--;
        }
    }

    private static Integer sumOfList(List<Integer> list){
        int sum=0;

        for(Integer integer:list){
            sum+=integer;
        }

        return sum;
    }
}
