package com.company.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkingWIthArrays {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=600;

        int[] nums = {1,2,4,5,6};
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString( numbers));

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(4);
        numbersList.add(0,6);
        System.out.println(numbersList.contains(0));
//        for(Integer num: numbersList){
//            System.out.println(num);
//        }
        numbersList.forEach(System.out::println);

    }
}
