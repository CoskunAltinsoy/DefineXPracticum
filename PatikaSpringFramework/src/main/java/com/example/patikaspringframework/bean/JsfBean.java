package com.example.patikaspringframework.bean;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.Data;

@Named (value = "cdiBean")
@ApplicationScoped
@Data
public class JsfBean {
    private  String patika;
    public JsfBean() {
        this.patika = "Welcome to this bootcamp";
    }
}
