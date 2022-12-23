package ders35_exceptions;

import java.util.Scanner;

public class C01_Exceptions {
    public static void main(String[] args) {


        // kullanicidan bir tam sayi alin,
        // ve sayinin karesini yazdirin

        // kullanici ondalikli sayi girerse kullaniciya uyari yazisi yazdirip
        // tekrar sayi isteyin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");

        int sayi=scan.nextInt();
        System.out.println(sayi*sayi);
    }
}
