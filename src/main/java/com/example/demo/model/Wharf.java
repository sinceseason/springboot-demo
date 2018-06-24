package com.example.demo.model;

import com.example.demo.base.model.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "wharf")
public class Wharf extends BaseModel {

    @Column(name = "wharfName")
    private String wharfName;

    public String getWharfName() {
        return wharfName;
    }

    public void setWharfName(String wharfName) {
        this.wharfName = wharfName;
    }
}
