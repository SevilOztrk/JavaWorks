package ders35_exceptions;

import java.util.Scanner;

public class C03_ArrayIndwxOutOfBounsExceptions {
    public static void main(String[] args) {

        // kullanicidan bir index isteyin,
        // verilen bir arraYdan kullanicinin girdigi indexdeki elementi yazdirin.


        int[] arr= {2,3,4,5,6};

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir index giriniz");
        int index= scan.nextInt();

        try {

            System.out.println(arr[index]);

        } catch (ArrayIndexOutOfBoundsException hata) {

           // System.out.println(hata.getMessage()); // Index 8 out of bounds for length 5, index uzunlugu dısında demek yani.

           // hata.printStackTrace();

            // java.lang.ArrayIndexOutOfBoundsException: Index 42 out of bounds for length 5
            //	at ders35_exceptions.C03_ArrayIndwxOutOfBounsExceptions.main(C03_ArrayIndwxOutOfBounsExceptions.java:20)
            // javanin yazdigi tum hata mesajini verir
            // ama kodlar calismaya devam eder
            // catch blogunda hicbir kod olmasada kodlarimiz normal calismaya devam eder
            // catch blogunda kullaniciya yazidracagimiz mesaj
            // tamamen kod yazanin insiyatifindedir.
            // exception classindan hazir hata mesajları da yazdirabilir,
            // kendi istediği kodlari da calistirabilir
            // hicbir sey yazmayadabilir.
        }

    }
}
