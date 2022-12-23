package ders41_iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

        // java collections icerisindeki bazi classlar index desteklemez.
        // bu durumda index kullanmadan collection icerisindeki tum elementlere ulasabilmek
        // ve onlari uptade edebilmek icin farkli ihtiyaclarimiz olabilir.

        // List<> index yapisini destekledigi icin boyle bir ihtiyac duymaz.
        // ancak bugunluk index kullanmadan list elementlerine ulasmaya ve onlari uptade etmeye calisalim.

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // index kullanmadan listin tum elementlerini yazdirin.

        for (Integer each : sayilar
             ) {
            System.out.println(each +" ");

        }

        // index kullanmadan listin elemntlerini birer artirin.
        // index kullanmadan 25 den buyuk sayilari listten silin.

        for (Integer each:sayilar
             ) {
            System.out.print(each +1 + " "); //11 21 31 41
        }
        System.out.print(sayilar); // [10, 20, 30, 40] atama yapmadik sadece 1 fazlasini yazdirmis oldk.

        for (Integer each:sayilar
             ) {
            each=each+1;
            System.out.print(each + " "); // loopta olan loopta kalir.
        }
        System.out.println(sayilar); // [10, 20, 30, 40]

        // ındex kullanmadan listin elemanlarini kalici olarak degistirmek mumkun olmadi.
        // java bunun icin iterator interface'i olusturmustur.


    }
}
