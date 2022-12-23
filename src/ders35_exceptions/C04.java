package ders35_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

        // kullanicidan bir tam sayi alin,
        // ve sayinin karesini yazdirin

        // kullanici ondalikli sayi girerse kullaniciya uyari yazisi yazdirip
        // tekrar sayi isteyen bir method olusturun

        sayiAlKaresiniYazdir();

    }

    public static void sayiAlKaresiniYazdir(){

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");

        int girilenSayi=0;


        try {
            girilenSayi=scan.nextInt();

            // eger ondalikli sayi girilirse 28. satir exception verecek ve
            // catch bloguna kadar olan diger kodlar calismayacak
            //catch blogu hata yakaladiginda ne yapmasini istedimizi söyledigimiz bolumdur.
            // bu soruda istenen exceptioın olustgunda yeniden deger istenmesi
            // biz de exception olustugunda yeniden methodu calistirdik.
            // hata olmazsa catch blogu devreye girmez ve kod normal bir sekilde biter.


            System.out.println(girilenSayi*girilenSayi);
        } catch (InputMismatchException e) {
            System.out.println("sana tam sayi degeri gir dedik");
            sayiAlKaresiniYazdir();



        }



    }
}
