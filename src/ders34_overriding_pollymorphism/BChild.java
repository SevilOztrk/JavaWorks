package ders34_overriding_pollymorphism;

public class BChild extends AParent{

    public void method1(){

        System.out.println("childclass method 1");
    }

    public void method2(int a){

        //overriding olabilmesi icin
        // hem method ismi hem de methos signaturesi ayni
        // olmalidir.

        System.out.println("child class method 2");
    }

    public void method2(String isim){

        System.out.println("child class String parametreli method 2");
    }

    @Override
    public void method3() {
        // super.method3();

        // overriding varsa parent ve child classdaki overridden ve overriding
        //methotlardan sadece biri calisir.
        // ikisini birden calistirmak istersek
        //super.method(3) kullanilir.
        //overriding method @override notasyonu ile isaretlenebilir.
        // @override kullanilmayan overriding isleminde, parent classtaki
        // overridden method silinirse
        //hicbir sorun olmaz. ancak @override kullanilan overriding isleminde, parent classtaki
        // overridden method silinirse veya signaturesi degistirilirse
        // CTE verir. boylece overidden method'un
        //silinmesi engellenir.
    }
}
