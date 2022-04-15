package com.hakim.bookRevise;

public class CalculatePI {
    public static void main(String[] args) {
        System.out.println(calculate(2_00_000));
    }
    public static double calculate(int nTerms){
        double numerator=4.0;
        double denominator=1.0;
        double sign=1.0;

        double pi=0.0;

        for(int i=0;i<nTerms;i++){
            pi +=sign*(numerator/denominator);
            denominator+=2.0;
            sign*=-1.0;
        }


        return pi;
    }
}
