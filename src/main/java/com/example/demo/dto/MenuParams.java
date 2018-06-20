package com.example.demo.dto;

import org.hibernate.validator.constraints.NotBlank;

public class MenuParams {

    @NotBlank
    private String main;

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }
}
