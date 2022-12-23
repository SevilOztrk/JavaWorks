package ders30_encapsulation;

public class EChild extends DParent{


    /*

    javadaki inharitance'nin insanlardan en buyuk farki :
    insanlarda parent child edinebilir ama child parentini secemez
    javada ise tam tersidir
    - siz bir class olusturdugunuzda daha once olusturulmus classlardan
    tum özelliklerini inherit etmek istediginiz class'i PARENT edinirsiniz.

    bir class baska bi,r classi inherit etmek istediginde
    extends keyword ile bunu deklare eder.

     */

    public static void main(String[] args) {

        EChild child1=new EChild();
        child1.yas=30;

        child1.isim="mahmut";

        child1.isEnough=false;
    }
}
