package ders31_inheritance;

public class GCorolla extends FToyota{

    String model="Corolla";
    String uretimYeri="Turkiye";

    GCorolla(){
        System.out.println("Corolla cons.calisti");
    }

    public static void main(String[] args) {

        GCorolla corolla1=new GCorolla();

        System.out.println(corolla1.marka); // Toyota

        /*
        bir child classtan obje olusturdugumuzda olusturlan obje
        sadece child class'a ait ozellikleri degil tum parent classlarındaki
        özellikleride tasir.
        bir objenin bir class'in ozelliklerini tasimasi icin o obje olusturulurken
        class'a ait cons'un calismis olmasi gerekir
        yani chil classindaki obje olusturulurken tum parent classlardaki cons'larda
        otomatik olarak calisir.

        java bu islem icin söyle bir mekanizma gelistirmistir,
        bir class olusturdugumuzda biz cons olusturmasakta
        javanin o class'a default cons koydugu gibi ,
        extends keyword kullanan bir class'da olusturulan her bir cons'ın
        ilk satirina biz gormesekte super() cons call koyar.
         */


    }
}
