package ders0_calismaSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A6 {
    public static void main(String[] args) {

        // verile bir arraydeki tekrar eden sayilari tek bir kere olacak sekilde arrayi düzenleyin.

        int [] arr= {1,2,3,2,5,2,3,6,4,8,2};

        List<Integer> tekrarsizList=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            if (! tekrarsizList.contains(arr[i])){

                tekrarsizList.add(arr[i]);
            }

        }
        System.out.println(tekrarsizList);

        arr=new int[tekrarsizList.size()];

        for (int i = 0; i <arr.length ; i++) {

            arr[i]=tekrarsizList.get(i);

        }
        System.out.println(Arrays.toString(arr));



    }
}
