package com.hakim.bookExcercise.chapter2;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your yearly income : ");
        int income=input.nextInt();
        int taxableIncome=income-3_00_000;
        double tax=0.0;

        if(taxableIncome <= 1_00_000){
            tax=taxableIncome*0.05;
        }else if(taxableIncome <= 1_00_000+3_00_000){
            tax=taxableIncome*0.05 + (taxableIncome-1_00_000)*0.10;
        }else if(taxableIncome <= (1_00_000+3_00_000+4_00_000)){
            tax=(taxableIncome*0.05) + ((taxableIncome-1_00_000)*0.10 )+ ((taxableIncome - (1_00_000 + 3_00_000)) * 0.15);
        }else if(taxableIncome <= (1_00_000+3_00_000+4_00_000+5_00_000)){
            tax=(taxableIncome*0.05) + ((taxableIncome-1_00_000)*0.10 )+ ((taxableIncome - (1_00_000 + 3_00_000)) * 0.15) + ((taxableIncome - (1_00_000 + 3_00_000+4_00_000)) * 0.20);
        }else {
            tax=(taxableIncome*0.05) + ((taxableIncome-1_00_000)*0.10 )+ ((taxableIncome - (1_00_000 + 3_00_000)) * 0.15) + ((taxableIncome - (1_00_000 + 3_00_000+4_00_000+5_00_000)) * 0.25);
        }
        System.out.println(tax);
    }
}

//? 2_000_000
//? first 3_00_000 => no tax + 1_00_000 => 5% tax + 3_00_000 => 10% tax + 4_00_000 => 15% tax + 5_00_000 => 20% tax + 4_00_000 or rest => 25% tax
//?