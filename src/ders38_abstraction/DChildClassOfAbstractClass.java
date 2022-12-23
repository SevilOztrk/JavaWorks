package ders38_abstraction;

public class DChildClassOfAbstractClass extends CParentAbstractClass {

    // Abstract bir class'daki, abstract methodlarin tamami
    // concrete child classlar tarafindan override edilmelidir.

    @Override
    public void mecburiMethod1() {
        System.out.println("child class methot icerisinde method'u kendine uyarlar");

    }

    @Override
    public void mecburiMethot2() {

    }


}
