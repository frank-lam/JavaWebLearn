package com.springboot2.domain;

import lombok.Data;

/**
 * Created By Cx On 2018/5/5 11:46
 */
@Data
public class User {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
