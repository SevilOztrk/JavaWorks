package ders40_interfaces;

public interface I01_Interface {

    // Interface'ler ozel yapi olduklarindan
    //yazilsa da yazilmasa da tum variableler
    // public, static ve finaldir.

    String MESAJ="Hello Interface";
    static int SAYI=20;

    public static boolean GUZEL_MI=true;

    public static final int SAYI2=30;

    //Ayni sekilde tum methodlar public ve abstarctir.

    void method1();
    abstract int method2();
    public abstract String method3();
}
