package com.driver;

public class RWOnly {
    private String name;
    void setName(String s){
        name=s;
//        System.out.println(name);
    }
    String getName(){
       return name;
    }
}
