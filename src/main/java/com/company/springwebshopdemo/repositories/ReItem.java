package com.company.springwebshopdemo.repositories;

import com.company.springwebshopdemo.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ReItem {

    @Autowired
    JdbcTemplate template;

    public Item fetchOnId(String id){
        //mockdata
        Item item = new Item("Tandpasta", "Colgate");
        return item;
    }

    public boolean create(Item item){
        String sql = "INSERT INTO Items (name, description) VALUES (?, ?)";
        return (template.update(sql, item.getName(), item.getDescription()) != 0);
    }

}
