package com.company.springwebshopdemo.services;

import com.company.springwebshopdemo.models.Item;
import com.company.springwebshopdemo.repositories.ReItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeItem {

    @Autowired
    ReItem reItem;

    public Item fetchOnId(String id){
        return reItem.fetchOnId(id);
    }

    public boolean create(Item item){
        return reItem.create(item);
    }

}
