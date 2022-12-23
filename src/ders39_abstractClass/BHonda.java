package ders39_abstractClass;

public abstract class  BHonda extends Araba{

    // Abstract bir class'i parent edindiğimizde
    // iki alternatifimiz olur
    // Parentimiz olan abstract classdaki abstract methodlari oeerride etmek
    // proje yapımız gerektiriyorsa bu class'ida abstract yapmak lazim

    public void marka(){
        System.out.println("marka: Honda");
    }



    public abstract void yakit();

    public abstract void guvenlik();

    public void ozelTeknoloji(){
        System.out.println("tum honda arabalar vtec teknolojisi kullanir");
    }






}
