package com.company.springwebshopdemo.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Item {

    @NotNull
    //@Size (min=1, max = 25)
    private String name;

    @NotNull
    //@Pattern (regexp="[A-Za-z]{50}")
    private String description;

    public Item(@NotNull String name, @NotNull String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
