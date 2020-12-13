package com.vvcl.bootiful.service;

import com.vvcl.bootiful.StaticValues;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AdderService {

    private int base;

    public AdderService() {
        base = 5;
    }

    public void setBase(int base) {
        this.base = base;
        System.out.println(this.base);
    }

    public int currentBase() {
        System.out.println("GET CURRENT BASE " + base);
        return base;
    }

    public int add(int adder) {
        return this.base + adder;
    }

    public int accumulate(int adder) {
        return this.base += adder;
    }

}
