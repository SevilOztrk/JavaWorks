package ders42_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_OrnekSoru {
    public static void main(String[] args) {

        /*
        Soru : Kullanicidan deger alarak iki String liste olusturun.
        Kullanici deger girmeyi birakmak icin 0’a basmalidir.
 Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
 liste1 : …….
 liste2 : …….
 ortak elementler : …….
         */


        System.out.println("Once list 1'i olusturalim");
        List<String> list1=kullanicidanAlarakListOlustur();
        System.out.println("Simdi 2. listeyi olusturalim");
        List<String> list2=kullanicidanAlarakListOlustur();

        System.out.println("Liste1:" + list1); // liste 1 i yazdirma
        System.out.println("Liste2:" + list2); // Liste 2 i yazdirma
        list1.retainAll(list2);

        System.out.println("Ortak elemanlar:" + list1); // ortaklari yazdirma

    }



    public static List<String> kullanicidanAlarakListOlustur(){

        // Soru : Kullanicidan deger alarak iki String liste olusturup main methoda dondurecek.
        //        Kullanici deger girmeyi birakmak icin 0’a basmalidir.

        List<String> isimListesi=new LinkedList<>();

        Scanner scan=new Scanner(System.in);

        String isim="";

        while (!isim.equalsIgnoreCase("0")){

            System.out.println("Listeye eklemek icin isim girinz \nBitirmek icin 0' a basin");
            isim=scan.nextLine();

            if (!isim.equalsIgnoreCase("0")){
                isimListesi.add(isim);

            }


        }
        return  isimListesi;



    }
}
