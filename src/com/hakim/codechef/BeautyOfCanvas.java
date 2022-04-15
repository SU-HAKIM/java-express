package com.hakim.codechef;

import java.util.Scanner;

public class BeautyOfCanvas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int times = input.nextInt();

        while(times > 0){

            int colors=input.nextInt();
            int result=1;
            for(int i=2;i<=colors;i++){
                if(i%2==0){
                    result^=i;
                }else{
                    result&=i;
                }
            }

            System.out.println(result);

            times--;
        }
    }
}
