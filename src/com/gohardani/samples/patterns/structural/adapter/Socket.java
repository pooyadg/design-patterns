package com.gohardani.samples.patterns.structural.adapter;

public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}