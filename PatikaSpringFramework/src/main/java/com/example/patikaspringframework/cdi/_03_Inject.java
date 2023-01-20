package com.example.patikaspringframework.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "injectuto")
@ApplicationScoped
public class _03_Inject {

    /*@Inject
    List<String> consumer;

    public List<String> getConsumer() {
        return consumer;
    }*/
}
