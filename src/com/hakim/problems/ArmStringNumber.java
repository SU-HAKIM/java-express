package com.hakim.problems;

import java.util.Scanner;

public class ArmStringNumber {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);

       while(true){
           int sum=0;
           System.out.println("Enter the number : ");
           int num=input.nextInt();
           int i=num;
           int temp;
           while(i > 0 ){
               temp=i%10;
               sum=sum + (temp*temp*temp);
               i=i/10;
           }

           System.out.println(sum);

           if(sum==num){
               System.out.println("ArmStrong");
           }else{
               System.out.println("Not");
           }
       }
    }
}

//? 153
//? 1^3 =1
//? 5^3=125
//? 3^3=27

//? 1 + 125 + 27 = 153