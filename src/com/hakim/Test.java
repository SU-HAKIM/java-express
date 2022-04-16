package com.hakim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,12,23,45};

        //? 2. int[] newArr=Arrays.copyOf(arr,10);


        //? 1. System.arraycopy(arr,0,newArr,0,10);

        int[] rangeCopy=Arrays.copyOfRange(arr,1,4);
        System.out.println(Arrays.toString(rangeCopy));
    }
}