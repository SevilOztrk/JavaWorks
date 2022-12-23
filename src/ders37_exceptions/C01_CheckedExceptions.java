package ders37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_CheckedExceptions {
    public static void main(String[] args) throws IOException { // parent yani daha cok exceptions yakalayabiliyor

        String dosyaYolu="src/ders36_checkedExceptions/Deneme.txt";

        int k=0;

        try {

            FileInputStream fis=new FileInputStream(dosyaYolu);
            while((k=fis.read())!=-1) {
                System.out.print((char)k);
            }

        } catch (FileNotFoundException e) { // child bu sadece kendisinin yakalayabileceği daha az exceptions yakalar

            System.out.println("Dosya yolu yanlis veya dosya arizali");

        }catch (IOException e){

            System.out.println("Dosya okuma veya yazma ile ilgili bir sorun var");

        }

        /*
        bir kod calisirken birden fazla exception olusma ihtimali varsa
        bu kodu calisir hale getirmek icin 4 ihtimal vardir;

        1- her bir exception icin ic ice try catch bloglari kullanmak
        2- Bir tane try blogu birden fazla catch blogu olusturmak
        3- method signature'na tum exception ihtimallerini yazmak (exceptions handle edilmis olmaz)
        4- eger muhtemel exceptionlarin tumunu kapsayan daha genis kapsamli bir exception varsa
        onu kullanmak.
         */

        /*
        2. ve 3. ihtimallerde olusmasi muhtemel exceptionlar arasinda
        parent-child iliskisi olup olmadigi kontrol edilmelidir.
        aralarinda parent child iliskisi yoksa
        exceptionlari istedigimiz sirada yazabiliriz.

        ancak parent - child iliskisi varsa
        once child sonra parent yazilmalidir. aksi takdirde
        parent daha kapsamli oldugundan tum exceptionlari yakalar
         ve asagidaki child exception islevsiz kalir.
         Java bu durumu kabul etmez, CTE verir.
         */


    }
}
