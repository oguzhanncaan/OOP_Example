package com.oguzhan.repository;

import com.oguzhan.repository.entity.Mudur;
import com.oguzhan.utility.StaticValues;

import java.util.ArrayList;
import java.util.List;

/**
         * -----------------Repository Amacı Nedir?-------------------
         * ---> Herhangi bir sınıf için, verilerin işlenmesini -MÜDÜR- sınıfı özelinde konuşursak
         *      Müdürün bir yere kayıt edilmesi,
         *      Müdürün güncellenmesi,
         *      Müdür ile ilgili aramaların yapılması,
         *      sıralı bir şekilde müdür listesinin çekilmesi işlemlerini burada yaparız.
         */

public class MudurRepository {

    // Mudur[] mudurDizisi = new Mudur[50];
    // private List<Mudur> mudurListesi;

    // Constructor
    public MudurRepository(){
       // mudurListesi = new ArrayList<>(); // Bir liste oluşturuyorsak constructor da new yapmak daha mantıklı. --BEST PRACTISE--
    }
    /**
     * Müdür listesine eklemek için kullanılır.
     * @param mudur
     */
    public void save(Mudur mudur){
       // this.mudurListesi.add(mudur); // Müdür listesine kayıt edildi.
        StaticValues.mudurList.add(mudur);
    }
    /**
     * Müdür listesini kullanıyaca döner.
     * @return
     */
    public List<Mudur> findAll(){
        //return this.mudurListesi;
        return StaticValues.mudurList;
    }


}
