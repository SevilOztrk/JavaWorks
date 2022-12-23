package ders40_interfaces;

public class I02_ConcreteChildClassOfInterface implements I01_Interface {

    // Bir classi bir interface'in childi yapmak icin implement keyword kullanilir.

    public static void main(String[] args) {

        System.out.println(MESAJ);

        // sayi=40;
        // yazili olmasa da interface icerisinde oldugundan
        // final'dir ve atama yapilamaz.

        System.out.println(Integer.MAX_VALUE);
        // normalde variable isimleri, kucuk harfle baslar ve camelCase kullanilir.
        // ancak javada ortak kabul olarak
        // static ve final olarak isaretlenen variable isimleri tamamen buyuk harf ile yazilir.

        System.out.println(Math.PI);
    }


    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
