package ders44_maps;

import java.util.Map;

public class C02_Maps {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap=MapDepo.ornekMapOlustur();

        ogrenciMap.put(105,"Hasan-Can-11-K-MF");
        ogrenciMap.put(108,"Hikmet-Han-10-M-TM");

        System.out.println(ogrenciMap);

        // eger mapta olan bir key ile yeni bir deger eklerseniz
        // o key'e ait var olan value silinir ve yeni value gecerli olur.
        /*
        {101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Hasan-Can-11-K-MF,
        106=Fatma-CHan-10-K-Soz,
        108=Hikmet-Han-10-M-TM}

         */

        // 108 numaralı ögrencinin isim ve soyisim yazdirin

        System.out.println(MapDepo.isimSoyisimDondur(ogrenciMap,108));




        // 104 numarali ogrencinin subesini K yapin.
        // methotta istenen Key map'da varsa degistirip map'i geri dondurelim.
        // yoksa hicbir islem yapmadan map'i geri dondurelim.

        int ogrenciKey=104;
        String yeniSube="N";

        ogrenciMap =MapDepo.ogrenciyeYeniSubeAta(ogrenciMap,ogrenciKey,yeniSube);

        System.out.println(ogrenciMap);



    }
}
