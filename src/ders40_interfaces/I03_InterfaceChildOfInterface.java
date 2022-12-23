package ders40_interfaces;

public interface I03_InterfaceChildOfInterface extends I01_Interface {

    // eger bir interface'i baska bir interface'in childi yapmak
    // istersek extends keyword kullanilir.
    // Bir interface concrete class'i inherite edemez.

    void method1();

    // interface bir child parent interface'deki
    // abstract methodu override edebilir.
    // ama ikisininde bodysi olmadiğindan
    // bu islemin bir anlami yoktur.

    int method4();
    boolean method5();




}
