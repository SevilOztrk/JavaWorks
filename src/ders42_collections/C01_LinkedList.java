package ders42_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll1= new LinkedList<>();

        ll1.add("K");
        ll1.add("T");

        // LinkedList 3 tane interface'i implements etmistir.
        // List, Queue, Deque inetfaceleri
        // Dolayisiyla bu interacelerden gelen ilk concrete class oldugundan
        // bu 3 interfacedeki tum abstract methotlari override etmistir.

        // LinkedList olusturulurken secilen data turune göre
        // bu 3 interface'den birinin ozelliklerini alabilir
        // veya data turu linkedlist secilirse, 3 interface'nin
        //ozelliklerini de toptan alir.

        List<String> ll2=new LinkedList<>();

        // Daha onceden arraylist olustururken, list <> interfacesini data turu olarak
        // kallandigimizdan bu sekilde olusturulan linkedlistlern ozelliklerini biliyoruz.

        ll2.add("R"); // [R]

        ll2.add("Z"); // [R,Z]

        ll2.add(0,"A"); // [A, R, Z]

        ll2.addAll(2,ll1); // [A, R, K, T, Z]

        ll2.set(3,"M"); // [A, R, K, M, Z]

        ll2.add("K");
        ll2.add("T");

        System.out.println(ll2.get(3)); // M

        System.out.println(ll2.retainAll(ll1)); // true


        System.out.println(ll2);// [K, K, T]

        System.out.println(ll2.hashCode()); // 104275 hafızada tuttugu yerin ismini veriyo

        System.out.println(ll2.subList(2, 3));  // [T] 2 ile 3 ün arasındakini getir demek 2 dahil 3 haric


    }
}
