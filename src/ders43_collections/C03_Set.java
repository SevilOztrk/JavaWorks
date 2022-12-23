package ders43_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {

        // verilen bir arrayin tekrar eden elementlerini silip,
        // her elementin sadece bir kere kullanildigi hale getirin.


        int [] arr={6,4,3,2,3,5,6,4,3,2,4,6,3,2,1,2,4,5,5,1};

        Set<Integer> geciciSet=new HashSet<>();

        for (Integer each: arr
             ) {
            geciciSet.add(each);
        }

        int [] geciciArr=new int[geciciSet.size()]; // yeni ve bos bir array var

        // Set'teki benzersiz hale getirilen elementleri gecici array'e tasiyalim.

        int index=0;
        for (Integer each: geciciSet
             ) {

            geciciArr[index]=each;
            index++;

        }
        // tekrarsiz degerleri gecici arr'e tasidik.
        // simdi kendi array'imizi bu gecici arr degerine atayalim.

        arr=geciciArr;

        System.out.println(Arrays.toString(arr));

    }
}
