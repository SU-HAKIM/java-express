package com.hakim.codechef;

import java.util.Scanner;

public class PrettyNumbers {
    public static void main(String[] args) {
        //? ends with 2 / 3 /9
        //? from x to y

        Scanner input=new Scanner(System.in);

        int times=input.nextInt();

        while(times > 0){
            int count=0;
            int starts=input.nextInt();
            int ends=input.nextInt();

            for(int i=starts;i<=ends;i++){
                String str=i+"";
                if(str.endsWith("2") || str.endsWith("3") || str.endsWith("9")){
                    count++;
                }
            }

            System.out.println(count);

            times--;
        }
    }
}
