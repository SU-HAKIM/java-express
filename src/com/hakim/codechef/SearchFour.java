package com.hakim.codechef;

import java.util.Scanner;

public class SearchFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int times = input.nextInt();

        while(times > 0){
            int count=0;
            int num=input.nextInt();
            String str=num+"";
            String[] strArr=str.split("");

            for(String newNum:strArr){
                if(newNum.equals("4")){
                    count++;
                }
            }

            System.out.println(count);

            times--;
        }
    }
}
