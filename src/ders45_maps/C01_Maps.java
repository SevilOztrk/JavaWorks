package ders45_maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {
    public static void main(String[] args) {

        // verilen bir cumlede kullanılan her bir harfi
        // ve o harfin kullanim miktarini
        // A=5 . b=3 ... gibi yazdirin

        String str="Javayı balonu patlatmadan bitirelim";

        // J=1 , a=7 , v=1, y=1....

        String[] harflerArr=str.split("");
        System.out.println(Arrays.toString(harflerArr));
        //[J, a, v, a, y, ı,  , b, a, l, o, n, u,  , p, a, t, l, a, t, m, a, d, a, n,  , b, i, t, i, r, e, l, i, m]

        Map<String, Integer> kullanimMiktarlariMap=new TreeMap<>();
        int sayac=1;

        // 1- tum harfleri sirasi ile ele alacagiz.

        for (int i = 0; i < harflerArr.length ; i++) {

            // 2- ele aldigimiz harfin, daha once map'e eklenip eklenmedigini kontrol edelim.

            if(kullanimMiktarlariMap.containsKey(harflerArr[i])){
                continue; // iceriyosa hicbisey yapma devam et
            }else{
                // kod buraya geldiyse o harf henuz map'e eklenmemistir.
                // bu harfin kullanim miktarini bulmaliyiz.
                for (int j = i+1; j < harflerArr.length ; j++) {

                    if (harflerArr[j].equals(harflerArr[i])){
                        sayac++;

                    }

                }

                // sayma islemi bitti, key ve Value'yu map'e ekleyelim.

                kullanimMiktarlariMap.put(harflerArr[i], sayac);
                sayac=1;

            }

        }
        System.out.println(kullanimMiktarlariMap);



    }
}
