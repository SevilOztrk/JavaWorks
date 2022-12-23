package ders47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMap {

    public static void main(String[] args) {

        TreeMap<String, Integer> mp1=new TreeMap<>();
        mp1.put("A", 5);
        mp1.put("H", 3);
        mp1.put("C",7);
        mp1.put("T", 3);
        mp1.put("F", 8);

        System.out.println(mp1); //{A=5, C=7, F=8, H=3, T=3}

        System.out.println(mp1.higherKey("D")); // bundan daha yuksek olan key  // F // girilen degerden buyuk olan
        System.out.println(mp1.higherKey("H")); // T H'den daha buyuk olani yazdirir.

        System.out.println(mp1.higherKey("U")); // null U'dan sonra bisi yok cnkü
        System.out.println(mp1.higherEntry("M")); // T=3

        System.out.println(mp1.lowerKey("F")); // C // Girilen degerden kucuk olani verir
        System.out.println(mp1.lowerEntry("G")); // F=8

        System.out.println(mp1.floorKey("D")); // D'den daha kucuk olan // C yazdirdi. // girilen degere esit veya kucuk olan
        System.out.println(mp1.floorKey("H")); // H
        System.out.println(mp1.floorEntry("L")); // H=3
        System.out.println(mp1.floorEntry("T")); // T=3 asagiya yuvarlamak gibi floor

        System.out.println(mp1.ceilingKey("F")); // F'ye esit yada buyuk olani verir. // girilen degere esit veya buyuk olan
        System.out.println(mp1.ceilingKey("B")); // C verir buyuk yada esit dedigi icin
        System.out.println(mp1.ceilingEntry("H")); // H=3


        System.out.println(mp1.headMap("F")); // {A=5, C=7} F'ye kadar olan keyleri aldi. // girilen deger harci basa kadar
        System.out.println(mp1.headMap("K")); // {A=5, C=7, F=8, H=3}

        System.out.println(mp1.headMap("F",true)); // {A=5, C=7, F=8}  F'yide aldi. // true dersek girilen deger dahil basa kadar
        System.out.println(mp1.headMap("N",true)); // {A=5, C=7, F=8, H=3} N yok öncekileri aldi

        System.out.println(mp1.tailMap("F")); // {F=8, H=3, T=3} F'den itibaren sonrasini aldi. // girilen dahil sona kadar
        System.out.println(mp1.tailMap("D")); // {F=8, H=3, T=3} D olmadigi icin d'den sonrasini yazdirdi.
        System.out.println(mp1.tailMap("F",false)); // {H=3, T=3} // girilen dahil degil sona kadar


        System.out.println(mp1.descendingMap()); // {T=3, H=3, F=8, C=7, A=5} sıralama
        System.out.println(mp1.firstKey()); // A ilk key'i verir
        System.out.println(mp1.firstEntry()); // A=5

        System.out.println(mp1.lastKey()); // T
        System.out.println(mp1.lastEntry()); // T=3

        System.out.println(mp1.pollFirstEntry()); // A=5 // ilk elementi siler ve bize getirir.
        System.out.println(mp1); // {C=7, F=8, H=3, T=3} MAp'in geriye kalan hali A'siz oldu

        System.out.println(mp1.pollLastEntry()); //T=3 bu da sonrakini siler

        System.out.println(mp1.subMap("B","G")); //{C=7, F=8}  B den G ye kadar olani aldi.
        System.out.println(mp1.subMap("C","H")); // {C=7, F=8} baslangıc inclusive, bitis ecxclusive

        System.out.println(mp1.subMap("C", false, "H", true)); // {F=8, H=3} baslangic exclusive, bitis in




    }
}
