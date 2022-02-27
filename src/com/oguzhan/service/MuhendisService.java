package com.oguzhan.service;

import com.oguzhan.repository.MuhendisRepository;
import com.oguzhan.repository.entity.Muhendis;

import java.util.List;

public class MuhendisService {

    private MuhendisRepository repository;

    public MuhendisService(){
        repository = new MuhendisRepository();
    }

    public void save(Muhendis muhendis){
        repository.save(muhendis);
    }

    public List<Muhendis> findAll(){
        return repository.findAll();
    }
}
