package com.hakim;

public class HarmonicSeries {
    public static void main(String[] args) {
        HarmonicSeries series=new HarmonicSeries();
        double value=series.harmonic(4);
        System.out.println(value);

    }

    public double harmonic(int n){
        double sum=0.0;

        for(int i=1;i<=n;i++){
            double divide=divide(1.0,i);
            sum=add(sum,divide);
        }
        return sum;
    }

    public double divide(double a , double b){
        return a / b;
    }

    public double add(double a,double b){
        return a+b;
    }
}
