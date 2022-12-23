package ders38_abstraction;

public abstract   class CParentAbstractClass {

    /*
    abstract bir class abstract methotlara sahip olabilir.
    Bir class'i abstract yapmak icin class declaration'ina abstract keyword eklenmelidir.
     */


    public abstract void mecburiMethod1();


    public abstract void mecburiMethot2(); // soyut methotların bodysi olmaz


    public String concrete (){

        // bugüne kadar kullandigimiz normal methotlara soyut olmayan
        // methot demek yerine concrete method denir. -concrete katı demek somut
        return "";
    }

    /*
    bir parent class'da child class'larin mutlaka override edeceği bir method olusturdugumuzda
    method body'si gereksizleşir.
    cunku hic calismayacaktir.

    1- abstarct parent class'dan obje olusturulamayacaği icin objeler icin bu method kullanilamaz.
    2- child class'lar mebcuren bu methodu override edeceklerinden, bu methodlarin bodysi asla kullanilmayacaktir.

    java hic kullanilmayacak bu method body'leri yazmamamiza imkan tanimistir.

    // Child class'larin mutlaka override etmesini istedigimiz methodlari
    abstarct olarak tanimlar ve bodysiz olarak olustururz
     */


}