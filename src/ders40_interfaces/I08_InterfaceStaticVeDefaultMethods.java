package ders40_interfaces;

public interface I08_InterfaceStaticVeDefaultMethods {


    /*
    java 8 ile devoloperlarin talebi uzerine yeni bir istisnai durum java'ya eklenmiştir.
    bir interface'i yillar icerisinde yüzlerce class inherit etmis olabilir.
    sonradan interface'e eklenen bir abstract method tum eski childler tarafindan inherit edilmelidir.
    aksi takdirde tum eksi child classlar CTE verecektir.

    java 8 ile birlikte java, interface'lere default ve static ile isaretlenmek
    sarti ile bodysi olan method eklenmesine izin vermistir.
    bu sayede interface' e sonradan eklenen method body'si oldugu icin override edilmek zorunda degildir.

    interface icerisinde body'si olan method ousturmak icin kullanilan
    default ve static keywordleri arasinda tek bir fark vardir.
    default kullanilan methodlar obje olusturularak cagirilabilirken
    static olarak isaretlenen  methodlar direkt kullanilabilir.


     */
    void method1();
    void method2();


    // interface'deki tum methodlar public ve abstractir.
    // biz interfacedeki bir method deklarosyanina default yazarsak
    //bu access modifier degildir.


   public  default void method3(){
       System.out.println("Interface icindeki body'li default method");

   }
   public static void method4(){
       System.out.println("Interface icindeki body'li static method");

   }
}
