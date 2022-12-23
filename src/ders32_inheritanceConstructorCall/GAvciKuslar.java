package ders32_inheritanceConstructorCall;

public class GAvciKuslar extends FKuslar{
    public static void main(String[] args) {

        GAvciKuslar avci1=new GAvciKuslar();


        FKuslar avci2=new GAvciKuslar();

        EHayvanlar avci3=new GAvciKuslar();

        /*
        bir child class'ta obje olusturmak icin child class constructoru kullanilir

       ama o data turunu o objenin bagli oldugu classlardan secebilirz
       eger cons ve data turu farkli secilirse bu durumda class uyesi olan
       variable ve methotlar farkli davranislar gösterirler
         */
    }
}
