package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
         // obj.name = "Mohd Talib";
        // System.out.println(obj.name);
        obj.setName("Mohd Talib");
        System.out.println(obj.getName());
     
    }
}
