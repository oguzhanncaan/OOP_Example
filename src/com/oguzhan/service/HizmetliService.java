package com.oguzhan.service;

import com.oguzhan.repository.HizmetliRepository;
import com.oguzhan.repository.entity.Hizmetli;

import java.util.List;

public class HizmetliService {

    private HizmetliRepository repository;

    public HizmetliService(){
        repository = new HizmetliRepository();
    }

    public void save(Hizmetli hizmetli){
        repository.save(hizmetli);
    }

    public List<Hizmetli> findAll(){
        return repository.findAll();
    }
}
