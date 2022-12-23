package ders35_exceptions;

public class C02_ArithmeticException {
    public static void main(String[] args) {

        // verilen iki sayiyi birbirine bolup
        // sonucun tam sayi kismini yazdirin.


        int sayi1=21;
        int sayi2=0;


        try {
            //riskli oldugunu ongordugumuz kodlar (try)
            System.out.println(sayi1/sayi2);

        } catch (Exception e) {   // catch (ArithmeticException e) bu da ongordugumuz risk (herhangi bir exceptions yakalarsa demek)

            System.out.println("sayi sifira bolunemez");

            // catch(0'den sonraki {} catch blogu denir

            throw new RuntimeException(e);
        }



        // bazi exceptionlar if else ile handle edilebilir
        //ancak tum exceptionlar icin if elşse yeterli olmaz.



    }
}
