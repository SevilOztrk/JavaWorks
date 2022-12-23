package ders35_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_TryCatch {
    public static void main(String[] args) {

        //  kullanicidan istedigi kadar sayi girmesini isteyip
        // girilen sayilari toplayin.
        // kullanicinin islemi bitirmesi icin Q ya basmasini isteyin
        // Q'ya basildiginda toplam kac sayi girdigini
        // ve bu sayilarin toplaminin kac oldugunu yazdirin.


        Scanner scan=new Scanner(System.in);


        double girilenSAyi= 0;

        double toplam=0;

        int sayac=0;

        boolean devam=true;


        while (devam){

            System.out.println("lutfen istediginiz kadar sayi girinz. \n bitirmek icin Q'ya basiniz");


            try {
                girilenSAyi= scan.nextDouble();
                toplam+=girilenSAyi;
                sayac++;

            } catch (InputMismatchException hata) {

                break;

            }





        }
        System.out.println("girilen:" + sayac + "adet sayinin toplami:" + toplam);

    }
}
