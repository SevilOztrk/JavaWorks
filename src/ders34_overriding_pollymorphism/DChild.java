package ders34_overriding_pollymorphism;

public class DChild extends CPArent{

    //overriding kurallari;
    //1- Access modifier methos signature'a dahil olmadiğindan
    // overridine ve overriding access modifie'lar' farkli olabilir.
    //child parent'i sinirlandiramaz.
    // yani overriding methodun access modifier'i daha genis kapsamlı olmalidir.
    // ya da ayni olmalidir.
    //private
    //default
    //protected
    //public            dar'dan genis'e

     protected void method1(){

    }

    //2- private ve static methodlar override edilemez.
    //itiraz etmedi ayni isimler oldugundan ama override'da etmedi.
    // @override notasyonu kullanilmak isterse CTE verir
    // java bunlari farkli classlardaki farkli methodlar olarak kabul eder.

    public static  void method2(){

    }

    private void method3(){

    }

    //3- return type signature'ina dahil olmadiğindan
    //farkli secilebilir.
    //ancak return type void veya primitive ise ayni olamk zorundadir.

   // public int method4(){

   // }

    // eger return typler non primitive ise ;
    // child classtaki return type parent class'daki return type'in
    //child'i olmalidir.
    // mesela object String ve Integerin parentidir.
    // object classi butun parentlerin classidir.


    public Integer method5(){
         return 5;

    }


}
