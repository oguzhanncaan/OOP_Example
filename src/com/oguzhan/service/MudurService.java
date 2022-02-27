package com.oguzhan.service;

import com.oguzhan.repository.MudurRepository;
import com.oguzhan.repository.entity.Mudur;

import java.util.List;

public class MudurService {

    private MudurRepository repository;

    public MudurService(){
        repository = new MudurRepository();
    }

    public void save(Mudur mudur){
        repository.save(mudur);
    }

    public List<Mudur> findAll(){
        return repository.findAll();
    }
}
