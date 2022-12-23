package ders40_interfaces;

public class I07_ConcreteChildOf2Interfaces implements I05_Interface, I06_Interface{

    /*
    1- Bir class sadece bir class'a extends edilebilir.
    ancak, birden fazla interface'e implements edilebilir.
    2- Concrete child class impelent ettigi tum interfacelerdeki
    abstarct methotlari override etmek zorunda oldugundan , iki interface'deki tum methotlari override etmek gerekir.
    - İki interfacede ayni isimde ve ayni return type'a sahip
    methotlardan hangisini override ettigi onemli degildir.
    - ancak isimler ayni return typler farkli oldugunda iki interface'i
    birden implement etmemiz mumkun olmayacaktir. bu durumda ;
    * ya child classtan bu iki interface'i implements etmekten vazgecmelisiniz
    * ya da sisteme mudahale imkaniniz varsa bu conflict'i cozmelisiniz.

    3- Child classtan parent interfacelerdeki variableleri kullanmak istersek

        ayni isimde iki interfacede'de variable varsa tercihinizi belirtmelisiniz.
        interfaceIsmi.variable seklinde belirtmelisin.
        kullanacagimiz variable sadece bir interfacede varsa sadece variableismi yazmak yeterli olacaktir.

     */

    public static void main(String[] args) {
        System.out.println(SAYI2);
        System.out.println(I05_Interface.MESAJ);
    }
    @Override
    public void method1() {

    }

    @Override
    public String method2() {
        return null;
    }

    @Override
    public int method4() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
