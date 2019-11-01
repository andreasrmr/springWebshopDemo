package com.company.springwebshopdemo.controllers;

import com.company.springwebshopdemo.models.Item;
import com.company.springwebshopdemo.services.SeItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class API {

    @Autowired
    SeItem seItem;

    @GetMapping("/createItem")
    public String showCreateItemForm(Item item){
        return "createItem";
    }



}
