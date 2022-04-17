package com.hakim.bookRevise;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        String[] arr={"I","Love","Java"};
        StringJoiner joiner=new StringJoiner(" ","[","]");
        for(String text:arr){
            joiner.add(text);
        }
        System.out.println(joiner);
    }
}
