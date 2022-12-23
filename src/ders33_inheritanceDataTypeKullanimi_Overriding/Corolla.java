package ders33_inheritanceDataTypeKullanimi_Overriding;

public class Corolla extends BToyota{

    String model="Corolla";
    String uretimYeri="Turkiye";
    int yil=2023;

    public static void main(String[] args) {

        /*
        bir obje olusuturulrken data turu ve constructor ayni classtan ise
        bir variable'in degerini bulmak icin o class'a gideriz.
        o classta yoksa sirasiyla parent classlara bakariz.
        ilk bulunan kullanilir.
         */

        Corolla corolla1=new Corolla();

        System.out.println(corolla1.model); // Corolla
        System.out.println(corolla1.uretimYeri); // Corolla
        System.out.println(corolla1.yil); // Corolla
        System.out.println(corolla1.marka); // BToyota
        System.out.println(corolla1.plaka); //Araba
        System.out.println(corolla1.motor); // Araba
        System.out.println(corolla1.yakit); // BToyota

        BToyota corolla2=new Corolla();

        /*
        obje olusturulurken data turu ve cons farkli ise
        variable'nin degerini bulmak icin data turu olan class'a gidilir.
        varsa kullanilir yoksa o classin parentlerina bakılır.
        bulunamazsa CTE verir. ama geri vites yapmaz.
         */

        System.out.println(corolla2.model); // BToyota
        // System.out.println(corolla2.uretimYeri); // CTE verir.
        System.out.println(corolla2.yil); // BToyota
        System.out.println(corolla2.marka); // BToyota
        System.out.println(corolla2.plaka); //Araba
        System.out.println(corolla2.motor); // Araba
        System.out.println(corolla2.yakit); // BToyota


        Araba corolla3=new Corolla();

        // System.out.println(corolla3.model); // CTE
        // System.out.println(corolla2.uretimYeri); // CTE verir.
        // System.out.println(corolla3.yil); // CTE
        //System.out.println(corolla3.marka); // CTE
        System.out.println(corolla3.plaka); //Araba
        System.out.println(corolla3.motor); // Araba
        System.out.println(corolla3.yakit); // Araba

        BToyota toyota1=new BToyota();
        System.out.println(toyota1.marka); // BToyota
        System.out.println(toyota1.model); //Toyota
        System.out.println(toyota1.yil); // BToyota
        System.out.println(toyota1.motor); // Araba
        System.out.println(toyota1.plaka); //Araba
        System.out.println(toyota1.yakit); //BToyota


        Araba toyota2=new BToyota();
       //  System.out.println(toyota2.marka); // CTE
       // System.out.println(toyota2.model); // CTE
       // System.out.println(toyota2.yil); // CTE
        System.out.println(toyota2.motor); // Araba
        System.out.println(toyota2.plaka); //Araba
        System.out.println(toyota2.yakit); //Araba


        Araba toyota3=new Araba();

        System.out.println(toyota3.motor);
        System.out.println(toyota3.yakit);
        System.out.println(toyota3.plaka);



    }
}
