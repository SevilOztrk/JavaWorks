package ders42_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListOueueDataTuru {
    public static void main(String[] args) {

        Queue<String> q1=new LinkedList<>();

        q1.add("H");
        q1.add("Y"); // [H, Y]



        q1.offer("K"); // [H, Y, K]

        System.out.println(q1.remove());  // [Y, K] H'yide bize dondurdu.
        // Queue eklemeyi sona yapip, kullanmayi bastan yaptigi icin
                    // parametre girmedigimizde bastaki elemani remove eder.

        System.out.println(q1.remove("K"));  // true yazdirdir ve elde Y kaldi.

        System.out.println(q1.poll()); // liste bosken calistirirsan null yazdirir.
                                        // liste doluyken calistirirsan Y'yi getirir.

        // q1 poll() remove ile ayni islemi yapat yani bastaki elementi siler ve bize dondurur.
        // aralarindaki fark bos queue'da calistirildiklarinda
        // remove exception firlatirken, poll exception firlatmaz.


        System.out.println(q1.peek());
        // Silmeden queue'nin basindaki elementi bize getirir.
        // eger queue boşsa null getirir.

        System.out.println(q1);
    }
}
