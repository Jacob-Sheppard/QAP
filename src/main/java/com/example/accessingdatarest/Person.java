package com.example.accessingdatarest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String MemName;
    private String MemAddress;

    public String getMemName() {
        return MemName;
    }

    public void setMemName(String memName) {
        this.MemName = MemName;
    }

    public String getMemAddress() {
        return MemAddress;
    }

    public void setMemAddress(String MemAddress) {
        this.MemAddress = MemAddress;
    }
};