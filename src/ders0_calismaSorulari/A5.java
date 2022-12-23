package ders0_calismaSorulari;

import java.util.ArrayList;
import java.util.List;

public class A5 {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();

        int [] arr= {2,3,4,5,6,7,8,9};

        for (int i = 0; i <arr.length ; i++) {

            sayilar.add(arr[i]);

        }
        System.out.println(sayilar.contains(2));


    }
}
