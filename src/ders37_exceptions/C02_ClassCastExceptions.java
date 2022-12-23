package ders37_exceptions;

public class C02_ClassCastExceptions {
    public static void main(String[] args) {

        short sayi1=23;
        int sayi2=sayi1;

        Short sayi3=24;
        // Integer sayi4=sayi3;

        // Integer ve Short arasinda parent child iliskisi olmadiğindan
        // birbirine atama yapamazsiniz.

        // aralarinda parent-child iliskisi olan classlardan olusan
        // objeler icin auto-widening veya explicit-narrowing mumkundur.
        Object obj=sayi3;

        Integer sayi5=(Integer) obj;

        System.out.println("Short objeye cast edince:" + sayi5); // ClassCastExceptions
    }
}
