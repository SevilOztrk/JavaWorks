package ders41_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // iterator kullanarak, listenin elementlerini sondan basa doğru yazdirin.

        ListIterator<Integer> lit= sayilar.listIterator();

        // once iterator'ü sona götürelim.

        while (lit.hasNext()){

            lit.next();
        }
        // simdi sondan basa dogru gidelim
        // giderken elemntleri yazdiralim.

        while (lit.hasPrevious()){ // geriye doru yazdirmak icin
            System.out.print(lit.previous() + " ");


        }
        System.out.println("===");

        // iterator kullanarak listenin tum elemntlerini 5 artirin.

        System.out.println(lit.nextIndex()); // iteratorun nerede oldugunu
        // hatirlayamazsak bunla hangi indexin oncesinde oldugunu gorebilirz.

        while (lit.hasNext()){

            lit.set((Integer)lit.next()+5); // once bana degeri getirsin bende onun 5 fazlasini alıp set edeyim.

            // o getirdi yana gecip, biz 5 ekledik set (o degeri guncelleme) ettik.

        }
        System.out.println(sayilar);

        // iterator kullanarak 40'dan kucuk olan elementleri silin.

       while (lit.hasPrevious()){

           if (lit.previous()<40){
               lit.remove();

           }
       }
        System.out.println(sayilar);


    }
}
