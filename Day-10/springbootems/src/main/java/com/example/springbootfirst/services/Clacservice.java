package com.example.springbootfirst.services;

import org.springframework.stereotype.Service;

@Service
public class Clacservice {

    public int add(int a, int b) {
        
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public int mul(int a, int b) {
        return a*b;
    }

    public int div(int a, int b) {
        return a/b;
    }
}
