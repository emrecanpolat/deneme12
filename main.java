package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Musteri musteri1 = new Musteri();
        musteri1.isim = "Ahmet";
        musteri1.soyisim = "Uyar";
        musteri1.tc = "11222333412";
        musteri1.bakiye = 55000;

        Musteri musteri2 = new Musteri();
        musteri2.isim = "Mehmet";
        musteri2.soyisim = "Bulur";
        musteri2.tc = "11122237335";
        musteri2.bakiye = 15000;

        Musteri musteri3 = new Musteri();
        musteri3.isim = "Ali";
        musteri3.soyisim = "Gündüz";
        musteri3.tc = "11122213336";
        musteri3.bakiye = 78650;

        Musteri musteri4 = new Musteri();
        musteri4.isim = "Veli";
        musteri4.soyisim = "Gündüz";
        musteri4.tc = "1172223337";
        musteri4.bakiye = 987655;


        System.out.println("Müşterilerin toplam bakiyesi: "+(musteri1.bakiye+musteri2.bakiye+musteri3.bakiye+musteri4.bakiye));

    }
//Listenin içine tüm müşterileri at, oradan veri çekeceğiz.

}
