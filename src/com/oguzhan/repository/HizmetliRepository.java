package com.oguzhan.repository;

import com.oguzhan.repository.entity.Hizmetli;
import com.oguzhan.utility.StaticValues;

import java.util.List;

public class HizmetliRepository {

    public void save(Hizmetli hizmetli){
        StaticValues.hizmetliList.add(hizmetli);
    }

    public List<Hizmetli> findAll(){
        return StaticValues.hizmetliList;
    }

}
