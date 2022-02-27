package com.oguzhan.service;

import com.oguzhan.repository.BuroElemaniRepository;
import com.oguzhan.repository.entity.BuroElemani;

import java.util.List;

public class BuroElemaniService {

    private BuroElemaniRepository repository;

    public BuroElemaniService(){
        repository = new BuroElemaniRepository();
    }

    public void save(BuroElemani buroElemani){
        repository.save(buroElemani);
    }

    public List<BuroElemani> findAll(){
        return repository.findAll();
    }
}
