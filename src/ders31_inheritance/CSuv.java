package ders31_inheritance;

public class CSuv extends BinekArac{
    public static void main(String[] args) {

        CSuv suv1=new CSuv();
        System.out.println(suv1.marka); // Binek araclarin markasi vardir
        System.out.println(suv1.model);//Binek araclarin modeli olur
        System.out.println(suv1.motor); //Tum araclar motor kullanir
        System.out.println(suv1.plaka); //Tum araclarin plakasi olur
        System.out.println(suv1.yakit); // Tum araclar farklı yakıtla kullanir
        System.out.println(suv1.yil); // 1900
        suv1.hiz(); // binek araclarin hizi modele göre degisir
        suv1.teker(); // binek araclarin dört tekeri olur

        CSuv suv2=new CSuv();

        suv2.marka="toyota";
        suv2.model="Rav4";
        suv2.motor="1.6";
        suv2.plaka="06 ANK 006";
        suv2.yakit="Benzin";
        suv2.yil=2012;
        suv2.hiz(suv2.yakit);

    }

    public void hiz (String yakit){

        if (yakit.equalsIgnoreCase("benzin")){
            System.out.println("benzinli suv'ler maks 300 km yapar");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("dizel suv'ler maks 260 km yapar");

        }else{
            System.out.println("yakit belli degil, max hiz söyleyemem");
        }
    }
}
