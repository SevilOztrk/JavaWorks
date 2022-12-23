package ders31_inheritance;

public class BinekArac extends Arac{

    protected String marka= "Binek araclarin markasi olur";

    protected String model="Binek araclarin modeli olur";

    protected int yil=1900;

    protected void hiz(){

        System.out.println("binek araclarin hizi modele göre degisir");
    }

    protected void teker(){
        System.out.println("binek araclarin dört tekeri olur");
    }
}
