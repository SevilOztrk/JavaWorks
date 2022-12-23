package ders39_abstractClass;

public abstract class Araba {

    //Araba classını inherit eden tum classlar
    //motor, marka kasa ve tekerlek methodlarini override etmek zorunda kalsn.
    //ancak abs, klima methodlari opsiyonel olsun
    //isteyen child bu methodlari override etsin, isteyen override etmesin

    public abstract void  motor();

    public abstract void kasa();

    public abstract void tekerlek ();

    public abstract void marka();

    public void abs (){
        System.out.println("guvenlik  artirmak isteyen arabalar abs kullanmali");
    }

    public void klima(){
        System.out.println("konfor artirmak isteyen arabalar klima kullanmali");

    }

}
