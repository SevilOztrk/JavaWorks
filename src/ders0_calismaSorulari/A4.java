package ders0_calismaSorulari;

import java.util.ArrayList;
import java.util.List;

public class A4 {
    public static void main(String[] args) {


        List<String> harfler= new ArrayList<>();

        // tum sesli harfleri listeye ekleyin.

        String [] sesliHarfler= {"a","e","i","o","u"};

        for (int i = 0; i < sesliHarfler.length ; i++) {

            harfler.add(sesliHarfler[i]);

        }
        System.out.println(harfler);
    }
}
