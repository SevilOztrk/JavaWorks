package ders33_inheritanceDataTypeKullanimi_Overriding;

public class FAvciKuslar extends EKuslar{

    public void hareket(){
        System.out.println("Avci kuslar ucarlar");
    }

    public void beslenme(){
        System.out.println("avci kuslar et yerler");
    }

    public void pence(){
        System.out.println("avci kuslar pencelidir");
    }

    public void gaga(){
        System.out.println("avci kuslarin gagalari sivridir");
    }

    public static void main(String[] args) {

        FAvciKuslar avci1=new FAvciKuslar();

        /*
        bir obje olusturulurken constructor ve data turu aynı ise;
        hangi methodun gecerli oldugunu bulmak icin o class'a gider varsa kullaniriz.
        yoksa sirasi ile parentlera gider, ilk buldugumuzu kullaniriz.
         */

        avci1.beslenme(); // Avci kuslar
        avci1.hareket(); //Avci kuslar
        avci1.gaga(); // Avci kuslar
        avci1.pence(); //Avci kuslar
        avci1.cogalma(); // kuslar
        avci1.kanat(); //kuslar
        avci1.omur(); //hayvanlar
        avci1.solunum(); // kuslar


        EKuslar avci2= new FAvciKuslar();

        /*
        bir obje olusturulurken data turu ile constructor farkli ise hangi methodun
        gecerli olacağini bulmak icin ;
        once data turunun oldugu class ve parent'larına bakarak o methodu buluruz.
        bulamazsak CTE verir. bulursak HEMEN CALİSTİRMAYİZ.
        calistirmadan once o method overrid edilmis mi diye kontrol ederiz.
        override edilmisse override eden methodu calistirirz.
         */

        avci2.beslenme(); // Avci kuslar
        avci2.hareket(); //Avci kuslar
        avci2.gaga(); // Avci kuslar
        // avci2.pence(); //CTE
        avci2.cogalma(); // hayvanlar
        avci2.kanat(); //kuslar
        avci2.omur(); //hayvanlar
        avci2.solunum(); // kuslar


        DHayvanlar avci3=new FAvciKuslar();

        avci3.beslenme(); // Avci kuslar
        avci3.hareket(); //Avci kuslar
       // avci3.gaga(); // CTE
       // avci3.pence(); //CTE
        avci3.cogalma(); // kuslar
        // avci3.kanat(); //CTE
        avci3.omur(); //avci kuslar
        avci3.solunum(); // kuslar


        EKuslar kus1=new EKuslar();
        kus1.cogalma(); //kuslar
        kus1.solunum(); // kuslar
        kus1.kanat(); // kuslar
        kus1.gaga(); // kuslar
        kus1.hareket(); // hayvanlar
        kus1.omur(); // hayvanlar
        kus1.beslenme(); //hayvanlar

        /*
        data turuyle constructor aynıysa bulduğunda hemen kullan

        methotlarla belirlenen ozellikler en guncel bilgiyi bulurken variable ile
        belirlenen ozellikler ilk buldugu degeri kullanir.
        bunun icin methotlara dinamik variablelere statik ozellik denir.

        methotta data turuyle constructor arasında gidip geleceksin unutma
         */

        DHayvanlar kus2=new EKuslar();

        kus2.cogalma(); //kuslar
        kus2.solunum(); // kuslar
        // kus2.kanat(); // CTE
       // kus2.gaga(); // CTE
        kus2.hareket(); // hayvanlar
        kus2.omur(); // hayvanlar
        kus2.beslenme(); //hayvanlar




    }
}
