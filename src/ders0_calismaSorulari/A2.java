package ders0_calismaSorulari;

import java.util.Arrays;

public class A2 {
    public static void main(String[] args) {



        int [] arr= {5,2,8,4,6,9};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println(Arrays.binarySearch(arr,7));
    }
}
