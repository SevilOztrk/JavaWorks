package ders32_inheritanceConstructorCall;

public class DCamry extends BToyota{

    DCamry(String pc){

        super("Deniz");
    }

    DCamry(){


    }
    public static void main(String[] args) {

        // eger kullanilan argümente uygun bir constructor parent classta yoksa
        // direk CTE olur

        DCamry camry2=new DCamry("celal");

        DCamry camry1=new DCamry();
        //parametresiz araba constructor
        //Parametresiz Toyota Constructor
    }
}
