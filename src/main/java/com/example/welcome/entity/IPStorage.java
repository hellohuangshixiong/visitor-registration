package com.example.welcome.entity;

public class IPStorage {
    private int id;
    private String ip;
    private String time;
    private String address;

    public IPStorage() {
    }

    public IPStorage(int id, String ip, String time, String address) {
        this.id = id;
        this.ip = ip;
        this.time = time;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
