package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
         // obj.name = "Mohd Talib";
        // System.out.println(obj.name);
        /* Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        The field RWOnly.name is not visible
        The field RWOnly.name is not visible

        at com.driver.Main.main(Main.java:7)
        */
        obj.setName("Mohd Talib");
        System.out.println(obj.getName());    
    }
}
