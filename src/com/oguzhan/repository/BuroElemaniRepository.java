package com.oguzhan.repository;

import com.oguzhan.repository.entity.BuroElemani;
import com.oguzhan.utility.StaticValues;

import java.util.List;

public class BuroElemaniRepository {

    public void save(BuroElemani buroElemani){
        StaticValues.buroElemaniList.add(buroElemani);
    }

    public List<BuroElemani> findAll(){
        return StaticValues.buroElemaniList;
    }
}
