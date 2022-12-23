package ders39_abstractClass;

public class CHondaCivic extends BHonda{

    @Override
    public void motor() {
        System.out.println("honda civic araclar vtec teknolojili motorlar kullanir");

    }

    @Override
    public void kasa() {
        System.out.println("Civic araclar sedan veya hb kasa kullanir");

    }

    @Override
    public void tekerlek() {
        System.out.println("Civic araclar 155*90 teker kullanir");

    }

    @Override
    public void yakit() {
        System.out.println("Civic araclar benzinlidir");

    }

    @Override
    public void guvenlik() {

        System.out.println("Civic araclar guvenlik standartına uyar");

    }


    @Override
    public void abs() {
        System.out.println("honda civic arabalar standart olarak abs kullanir");
    }

    @Override
    public void klima() {
        System.out.println("honda civic arabalar standart olarak klima kullanir");
    }


    public static void main(String[] args) {

        /*
        abstract parent classlardaki abstract methodlar concrete child classlar tarafindan mecburen child edilir.
        ancak abstract parentlerdeki concrete methodlari override etmek mecburi degildir.
        eger child claa'a uyarlamak isterseniz override edebilirsiniz
        veya override etmeyip parent classtaki haliyle kullanabilirsiniz.
         */

        CHondaCivic civic1=new CHondaCivic();
        civic1.abs();
        civic1.klima();
        civic1.marka();
        civic1.ozelTeknoloji();

    }
}
