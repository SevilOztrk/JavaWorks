package ders44_maps;

import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap=MapDepo.ornekMapOlustur();

        // 10. satırdan sonra map üzerinde yapacagımız her degisiklik
        // bu classtaki ogrenci mapi etkiler. depoyla hicbir baglantısı yok. cünkü runtime.
        // gercekte olsaydı kalıcı olurdu.

        // map'in bu halini bi gorelim.

        System.out.println(ogrenciMap);

        //  {101=Ali-Can-10-H-MF,
        //  102=Veli-Cem-11-M-Soz,
        //  103=Ali-Cem-11-H-TM,
        //  104=Ayse-Can-10-H-MF,
        //  105=Ayse-Cem-11-M-TM,
        //  106=Fatma-CHan-10-K-Soz}




        // map'e 1 tane yeni element ekleyelim.

        ogrenciMap.put(110, "Fatih-Yan-10-T-MF");

        // 102 numaralı ogrenciyi uptade edelim.

        ogrenciMap.put(102,"Veli-Dem-12-D-Soz");

        System.out.println(ogrenciMap);

        // 103 no'lu ogrencinin isim ve soyismini yazdirin.

        System.out.println(MapDepo.isimSoyisimDondur(ogrenciMap, 103)); // Ali Cem


        // 105 no'lu ogrencinin subesini S yapin.
        ogrenciMap=MapDepo.ogrenciyeYeniSubeAta(ogrenciMap,105,"S");

        System.out.println(ogrenciMap);

        //{101=Ali-Can-10-H-MF,
        //         102=Veli-Dem-12-D-Soz,
             //    103=Ali-Cem-11-H-TM,
               //  104=Ayse-Can-10-H-MF,
               //  105=Ayse-Cem-11-S-TM,
                // 106=Fatma-CHan-10-K-Soz,
                //  110=Fatih-Yan-10-T-MF}


    }
}
