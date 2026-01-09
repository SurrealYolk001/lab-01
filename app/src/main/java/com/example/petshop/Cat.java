package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Pettable{
    public Cat(String name) {
        super(name);
    }

    public Cat(String name, Date birthdate) {
        super(name, birthdate);
    }

    @Override
    public void pet(){
        System.out.println(getName() + "purrs!");
    }

    @Override
    public String speak(){
        return "meow";
    }


}


