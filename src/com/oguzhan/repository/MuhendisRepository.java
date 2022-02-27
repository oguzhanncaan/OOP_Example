package com.oguzhan.repository;

import com.oguzhan.repository.entity.Muhendis;
import com.oguzhan.utility.StaticValues;

import java.util.List;

public class MuhendisRepository {

    public void save(Muhendis muhendis){
        StaticValues.muhendisList.add(muhendis);
    }

    public List<Muhendis> findAll(){
        return StaticValues.muhendisList;
    }
}
