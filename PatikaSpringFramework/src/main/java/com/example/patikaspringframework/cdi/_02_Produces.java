package com.example.patikaspringframework.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;
import jdk.jfr.Name;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Named(value = "producetuto")
@ApplicationScoped
public class _02_Produces {
    @Produces
    public List<String> getList(){
        List<String> list= new ArrayList<>();
        list.add("Java");
        list.add("C#");
        list.add("C");

        return list;
    }
}
