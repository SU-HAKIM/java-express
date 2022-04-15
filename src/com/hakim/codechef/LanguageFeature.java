package com.hakim.codechef;

import java.util.Scanner;

public class LanguageFeature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int times = input.nextInt();

        while(times > 0){

            int fea1=input.nextInt();
            int fea2=input.nextInt();

            //?language one feature
            int lan1Fea1=input.nextInt();
            int lan1Fea2=input.nextInt();

            //?language one feature
            int lan2Fea1=input.nextInt();
            int lan2Fea2=input.nextInt();

            if((fea1==lan1Fea1 || fea1 == lan1Fea2) && (fea2==lan1Fea1 || fea2==lan1Fea2)){
                System.out.println(1);
            }else if((fea1==lan2Fea1 || fea1 == lan2Fea2) && (fea2==lan2Fea1 || fea2==lan2Fea2)){
                System.out.println(2);
            }else{
                System.out.println(0);
            }


            times--;
        }
    }
}

