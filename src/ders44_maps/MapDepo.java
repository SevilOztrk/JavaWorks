package ders44_maps;

import java.util.HashMap;
import java.util.Map;

public class   MapDepo {

    // ogrenci map olusturup bize donduren bir methot olusturun.

    public static Map<Integer,String> ornekMapOlustur(){

        Map<Integer,String> ogrenciMap=new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Ayse-Cem-11-M-TM");
        ogrenciMap.put(106,"Fatma-CHan-10-K-Soz");

        return  ogrenciMap;
    }


    public static String isimSoyisimDondur(Map<Integer, String> ogrenciMap, int ogrenciKey) {

        /*
        {
        101=Ali-Can-10-H-MF,
         102=Veli-Cem-11-M-Soz,
         103=Ali-Cem-11-H-TM,
         104=Ayse-Can-10-H-MF,
         105=Ayse-Cem-11-M-TM,
         106=Fatma-CHan-10-K-Soz}
         */

        // ogrenciKey=105

        String ogrenciValue= ogrenciMap.get(ogrenciKey); //Ayse-Cem-11-M-TM,

        String[] valuarr=ogrenciValue.split("-"); // [Ayse, Cem, 11, M, TM]

        String isimSoyisim=valuarr[0] + " " + valuarr[1]; // Ayse Cem

        return isimSoyisim;



    }

    public static Map<Integer, String> ogrenciYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey) {

        // ogrenci key'i map'de var mi?

        if (ogrenciMap.containsKey(ogrenciKey)){



        }else {

        }
        return ogrenciMap;
    }

    public static Map<Integer, String>  ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey, String yeniSube) {
        // istene key varsa uptade edip yeni map'i dondurcez
        // yoksa gelen map'i aynen geri dondurcez.
       // ogrenci key map'da var mi? 104

        if (ogrenciMap.containsKey(ogrenciKey)) {

            // istene key varsa uptade edip yeni map'i dondurcez

            String istenenKeyValuesu = ogrenciMap.get(ogrenciKey); // Ayse-Can-H-MF
            String[] istenenKeyValueArr = istenenKeyValuesu.split("-"); // [Ayse, Can, 10, H, MF]
            // yeni sube degerini atayalim.

            istenenKeyValueArr[3] = yeniSube; // [Ayse, Can, 10, K, MF]

            String istenenKeyinYeniValuesi = istenenKeyValueArr[0] + "-" +
                    istenenKeyValueArr[1] + "-" +
                    istenenKeyValueArr[2] + "-" +
                    istenenKeyValueArr[3] + "-" +
                    istenenKeyValueArr[4];

            ogrenciMap.put(ogrenciKey, istenenKeyinYeniValuesi);

        }

        return ogrenciMap;



    }
}
