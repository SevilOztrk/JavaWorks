package ders45_maps;

import ders44_maps.MapDepo;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {

        // ogrenciler map'inde subesi H olan ogrencilerin isim soyisim ve siniflarini bulalim.

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();

        Set<Integer> ogrenciKeySet=ogrenciMap.keySet(); // Bir map'deki key'leri Set olarak dondurur.

       //  Collections<String> ogrenciValueCollection =ogrenciMap.values(); // Bir map'deki tum value'leri bize Collection olarak dondurur.
    }
}
