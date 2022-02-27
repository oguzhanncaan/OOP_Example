package com.oguzhan;

import com.oguzhan.repository.MudurRepository;
import com.oguzhan.repository.entity.Mudur;

public class Runner {
    public static void main(String[] args) {

        // Müdür-1
        Mudur mudur = new Mudur();
        mudur.setAd("Mehmet");
        mudur.setAdres("Ankara");
        mudur.setTelefon("05555555555");
        // Müdür-2
        Mudur mudur2 = new Mudur();
        mudur2.setAd("Ahmet");
        mudur2.setAdres("İzmir");
        mudur2.setTelefon("05333333333");

        // Veri Tabanı
        MudurRepository dbMudur = new MudurRepository();
        MudurRepository dbMudur2 = new MudurRepository();
        dbMudur.save(mudur);
        dbMudur.save(mudur2);

        System.out.println(dbMudur.findAll().get(0).getAd());

        /**
         * Müdür Listesi alıyorum. dbMudur.findAll()
         * Peki bu listede sıra ile ne vardır? -- > Müdür nesnesi
         *
         */
        for ( Mudur item : dbMudur.findAll()) {
            System.out.println("Id: " +item.getId());
            System.out.println("Sıra Nu: " +item.getSiraNo());
            System.out.println("Ad: " +item.getAd());
            System.out.println("------------------");
        }






    }
}
