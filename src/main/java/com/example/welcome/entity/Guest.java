package com.example.welcome.entity;

import java.util.Date;
public class Guest {
    private Integer id;
    private String time;
    private String name;
    private String item;
    private String company;

    public Guest() {
    }

    public Guest(Integer id, String time, String name, String item, String company) {
        this.id = id;
        this.time = time;
        this.name = name;
        this.item = item;
        this.company = company;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
