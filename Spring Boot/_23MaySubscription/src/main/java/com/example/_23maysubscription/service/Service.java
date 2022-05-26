package com.example._23maysubscription.service;


import com.example._23maysubscription.entiity.Subscribtion;
import com.example._23maysubscription.repo.SubRepos;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    SubRepos subRepos;

    public void save(Subscribtion subscription) {

        subRepos.save(subscription);
    }
}
