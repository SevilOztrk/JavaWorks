package ders0_calismaSorulari;

import java.util.Arrays;

public class A1 {
    public static void main(String[] args) {

         //Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //eski array’e yeni degeri atayin


        int [] arr={2,3,4,5};

        int eklenecekEleman=6;

        elemanEkle(arr,eklenecekEleman);





    }

    public static int [] elemanEkle(int [] arr, int eklenecekEleman){

        int [] yeniArr= new int[arr.length+1];

        for (int i = 0; i <arr.length ; i++) {

            yeniArr[i]=arr[i];

        }



        yeniArr[yeniArr.length-1]=eklenecekEleman;

        System.out.println(Arrays.toString(yeniArr));

        return yeniArr;




    }
}
