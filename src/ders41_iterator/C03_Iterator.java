package ders41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // iterator kullanarak bu listeden 15 ile 35 arasindaki sayilari silin.


        Iterator it1= sayilar.iterator();

        Integer elemnt;

        while (it1.hasNext()){

            elemnt=(Integer)it1.next();
            if (elemnt>15 && elemnt<35){

                it1.remove();
            }
        }
        System.out.println(sayilar); // 10,40

        sayilar.add(20);
        sayilar.add(30);

        System.out.println(sayilar);

        // tum elemntleri iterator yardimi ile silelim.

        Iterator it2= sayilar.iterator();

        it2.next();  // yana gecirir.

        it2.remove(); // uzerinden gectigi sayiyi siler.

        System.out.println(sayilar); //40,20,30

        it2.next();
        it2.remove();

        System.out.println(sayilar); //20,30


        while (it2.hasNext()){ // tek tek ugrasmak istemiyordak while kullanalim.
            it2.next();
            it2.remove();
        }

        System.out.println(sayilar);





    }
}
